package com.example.goldchargeproject;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.TextView;
import android.widget.Toast;

import com.example.goldchargeproject.data.GoldCardDataLayer;
import com.example.goldchargeproject.data.GoldCardSCoolDataBase;
import com.example.goldchargeproject.data.Staff;


public class MainActivity extends AppCompatActivity {

    public static GoldCardSCoolDataBase dataBase;
    private TextView userTxt;
    private TextView passTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GoldCardDataLayer.setContext(getApplicationContext());
        MainActivity.dataBase = GoldCardDataLayer.getGoldCardDataBase();
        userTxt = (TextView) findViewById(R.id.editUser_Name);
        passTxt = (TextView) findViewById(R.id.editPassword);

    }

    public void openActivity2(View view) {
        String userText = userTxt.getText().toString();
        String passText = passTxt.getText().toString();
        Staff loginUser = new Staff();
        loginUser.setEmail(userText);
        loginUser.setPassWord(passText);

        Intent intent = new Intent(this, DashBoard.class);

        Staff user = MainActivity.dataBase.theDao().login(userText,passText);

        if(user != null)
        {
            intent.putExtra("user", user);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(getApplicationContext(),"Invalid Login", Toast.LENGTH_SHORT).show();
        }



    }
    public void regView(View view){
        Intent intent = new Intent(this, AddNewUser_Admin.class);
        Toast.makeText(getApplicationContext(),"huh",Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }


}
