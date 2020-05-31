package com.example.diabetes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home_page extends AppCompatActivity {
    Button predictnow;
    Button glucose_btn, bmi_btn, pressure_btn, preggo_btn, pedigree_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        predictnow= (Button) findViewById(R.id.PredictNow);
        glucose_btn=(Button) findViewById(R.id.Glucose_info);
        bmi_btn= (Button) findViewById(R.id.BMI_info);
        pressure_btn= (Button) findViewById(R.id.Pressure_info);
        preggo_btn= (Button) findViewById(R.id.Preggo_info);
        pedigree_btn= (Button) findViewById(R.id.Pedigree_info);

        predictnow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Home_page.this, Input_page.class);
                startActivity(intent);
            }
        });
        glucose_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Home_page.this, Info_page.class);
                startActivity(intent);
            }
        });
        bmi_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Home_page.this, Info_page.class);
                startActivity(intent);
            }
        });
        pressure_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Home_page.this, Info_page.class);
                startActivity(intent);
            }
        });
        preggo_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Home_page.this, Info_page.class);
                startActivity(intent);
            }
        });
        pedigree_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Home_page.this, Info_page.class);
                startActivity(intent);
            }
        });

    }
}
