package com.example.weight_logger.presentation;

import androidx.activity.ComponentActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;
import com.example.weight_logger.R;

import java.time.LocalDate;

public class Exercises extends ComponentActivity{
    Button plus;
    Button minus;
    Button done;
    Integer count = 0;
    DBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logger);
        TextView workout = findViewById(R.id.exercise_name);
        Intent intent = getIntent();
        String exercise = intent.getStringExtra("exercise");
        workout.setText(exercise);
        TextView weight = findViewById(R.id.weight);
        weight.setText(count.toString());
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        done = findViewById(R.id.done);
        dbHandler = new DBHandler(Exercises.this);
        plus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                count += 5;
                weight.setText(count.toString());
            }
        });
        minus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (count >= 5){
                    count -= 5;
                }
                weight.setText(count.toString());
            }
        });
        done.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                dbHandler.addWorkout(String.valueOf(LocalDate.now()), exercise, count);
                Intent home = new Intent(Exercises.this, HomePage.class);
                startActivity(home);
            }
        });
    }
}
