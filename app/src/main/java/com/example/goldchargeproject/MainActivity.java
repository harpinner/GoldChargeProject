package com.example.goldchargeproject;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    SharedPreferences saveData;
    String userName;
    String passWord;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Context context = this.getApplicationContext();
        saveData = context.getSharedPreferences(getString(R.string.preference_file_key), Context.MODE_PRIVATE);
        userName = saveData.getString(getString(R.string.USER_NAME),"");
        passWord = saveData.getString(getString(R.string.USER_PASSWORD),"");
        setContentView(R.layout.activity_main);
    }

    public boolean login(String userName, String Password)
    {
        SharedPreferences.Editor editor = saveData.edit();
        editor.putString(getString(R.string.USER_NAME),userName);
        editor.putString(getString(R.string.USER_PASSWORD),Password);
        editor.commit();
        return true;

    }

    public void saveLogin(View that)
    {
        EditText text = (EditText)findViewById(R.id.editText);
        String value = text.getText().toString();
        EditText text2 = (EditText)findViewById(R.id.editText2);
        String value2 = text2.getText().toString();
        boolean success = login(value2,value);
//sdads





    }

    public void testPref(View that)
    {
        userName = saveData.getString(getString(R.string.USER_NAME),"");
        passWord = saveData.getString(getString(R.string.USER_PASSWORD),"");
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, "username & password = "+userName+"&"+passWord, duration);
        toast.show();
    }


}
