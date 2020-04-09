package com.example.goldchargeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.goldchargeproject.data.Staff;

public class AddNewUser_Admin extends AppCompatActivity {

    EditText userView;
    EditText passView;
    EditText emView;
    EditText jobView;
    EditText lastView;
    EditText firstView;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addnewuser_admin);
        userView = (EditText) findViewById(R.id.et_username);
        passView = (EditText) findViewById(R.id.et_password);
        emView = (EditText) findViewById(R.id.et_email_user);
        firstView = (EditText) findViewById(R.id.et_first_name_user);
        lastView = (EditText) findViewById(R.id.et_last_name_user);
        jobView = (EditText) findViewById(R.id.et_job_title);
    }
    
    public void newUser(View view)
    {
        Staff newStaff = new Staff();
        newStaff.setPassWord(passView.getText().toString());
        newStaff.setFirstName(firstView.getText().toString());
        newStaff.setEmail(emView.getText().toString());
        newStaff.setPosition(jobView.getText().toString());
        newStaff.setLastName(lastView.getText().toString());
        newStaff.setUserName(userView.getText().toString());
        MainActivity.dataBase.theDao().addStaff(newStaff);
    }
    
    public void resetForm(View v)
    {
        userView.setText("");
        passView.setText("");
        emView.setText("");
        firstView.setText("");
        lastView.setText("");
        jobView.setText("");
    }


    public void backClick(View v)
    {
        finish();
    }
}
