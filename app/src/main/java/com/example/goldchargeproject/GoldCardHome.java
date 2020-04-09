package com.example.goldchargeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.goldchargeproject.data.Student;

public class GoldCardHome extends AppCompatActivity {
    ImageView imageView;
    Student selectedStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goldcardhome);
        imageView = (ImageView) findViewById(R.id.imageView2);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3(view);
            }
        });
    }

    public void openActivity3(View view) {
        Intent intent = new Intent(this, GoldCardForm.class);
        intent.putExtra("student",selectedStudent);
        startActivity(intent);
    }
}
