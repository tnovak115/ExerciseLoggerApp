package com.example.weight_logger.presentation;
import androidx.activity.ComponentActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.content.Intent;
import android.widget.ListView;

import com.example.weight_logger.R;

public class Push extends ComponentActivity implements AdapterView.OnItemClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.push_exercises);
        ListView listView = findViewById(R.id.push_list);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long l){
        if (position == 0){
            Intent logger = new Intent(Push.this, Exercises.class);
            logger.putExtra("exercise", "Bench Press");
            startActivity(logger);
        }
        if (position == 1){
            Intent logger = new Intent(Push.this, Exercises.class);
            logger.putExtra("exercise", "Shoulder Press");
            startActivity(logger);
        }
        if (position == 2){
            Intent logger = new Intent(Push.this, Exercises.class);
            logger.putExtra("exercise", "Lat Raises");
            startActivity(logger);
        }
        if (position == 3){
            Intent logger = new Intent(Push.this, Exercises.class);
            logger.putExtra("exercise", "Pec Fly");
            startActivity(logger);
        }
        if (position == 4){
            Intent logger = new Intent(Push.this, Exercises.class);
            logger.putExtra("exercise", "Tricep Press");
            startActivity(logger);
        }
        if (position == 5){
            Intent logger = new Intent(Push.this, Exercises.class);
            logger.putExtra("exercise", "Incline Dumbbell Press");
            startActivity(logger);
        }
        if (position == 6){
            Intent logger = new Intent(Push.this, Exercises.class);
            logger.putExtra("exercise", "Tricep Pulldown");
            startActivity(logger);
        }
        if (position == 7){
            Intent logger = new Intent(Push.this, Exercises.class);
            logger.putExtra("exercise", "Dumbbell Pullover");
            startActivity(logger);
        }
        if (position == 8){
            Intent home = new Intent(Push.this, HomePage.class);
            startActivity(home);
        }
    }
}
