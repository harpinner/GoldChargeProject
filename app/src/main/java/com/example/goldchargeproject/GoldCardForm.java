package com.example.goldchargeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class GoldCardForm extends AppCompatActivity {
    private String deed;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goldcardform);
    }


    public void onSubmit(View v)
    {
        EditText tr = (EditText)findViewById(R.id.et_first_name);
        EditText td = (EditText)findViewById(R.id.et_last_name);
        EditText tda = (EditText)findViewById(R.id.et_date);
        String theString = tr.getText().toString() + " " + td.getText().toString();
        Log.d("this.getPackageName",theString);
    }

    public void onReset(View v)
    {
        EditText tr = (EditText)findViewById(R.id.et_first_name);
        EditText td = (EditText)findViewById(R.id.et_last_name);
        EditText tda = (EditText)findViewById(R.id.et_date);
        tr.setText("");
        td.setText("");
        tda.setText("");

    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        RadioButton checked = (RadioButton) view;
        deed = checked.getText().toString();


    }

}
