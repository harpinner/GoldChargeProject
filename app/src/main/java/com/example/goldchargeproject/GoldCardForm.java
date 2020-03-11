package com.example.goldchargeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class GoldCardForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goldcardform);
    }


    public void onSubmit(View v)
    {
        EditText tr = (EditText)findViewById(R.id.et_first_name);
        EditText td = (EditText)findViewById(R.id.et_last_name);
        String theString = tr.getText().toString() + " " + td.getText().toString();
        Log.d("this.getPackageName",theString);
    }
}
