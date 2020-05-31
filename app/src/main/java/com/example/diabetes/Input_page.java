package com.example.diabetes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Input_page extends AppCompatActivity {
    Button predict;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_page);
        predict= (Button) findViewById(R.id.Predict);
        predict.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Input_page.this, Prediction.class);
                startActivity(intent);
            }
        });
    }
}
