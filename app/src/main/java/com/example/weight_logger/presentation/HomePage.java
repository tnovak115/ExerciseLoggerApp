package com.example.weight_logger.presentation;
import android.os.Bundle;
import androidx.activity.ComponentActivity;

import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.content.Intent;
import android.widget.Button;
import com.example.weight_logger.R;

public class HomePage extends ComponentActivity{
    Button pushButton;
    Button pullButton;
    Button legButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.workout_day);
        pushButton = (Button) findViewById(R.id.pushButton);
        pushButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent push = new Intent(HomePage.this, Push.class);
                startActivity(push);
            }
        });
        pullButton = (Button) findViewById(R.id.pullButton);
        pullButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pull = new Intent(HomePage.this, Pull.class);
                startActivity(pull);
            }
        });
        legButton = (Button) findViewById(R.id.legsButton);
        legButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent legs = new Intent(HomePage.this, Legs.class);
                startActivity(legs);
            }
        });
    }
}
