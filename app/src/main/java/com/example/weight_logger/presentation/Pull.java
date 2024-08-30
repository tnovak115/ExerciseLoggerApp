package com.example.weight_logger.presentation;
import androidx.activity.ComponentActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.content.Intent;
import android.widget.ListView;

import com.example.weight_logger.R;

public class Pull extends ComponentActivity implements AdapterView.OnItemClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pull_exercises);
        ListView listView = findViewById(R.id.pull_list);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long l){
        if (position == 0){
            Intent logger = new Intent(Pull.this, Exercises.class);
            logger.putExtra("exercise", "Row");
            startActivity(logger);
        }
        if (position == 1){
            Intent logger = new Intent(Pull.this, Exercises.class);
            logger.putExtra("exercise", "Lat Pulldown");
            startActivity(logger);
        }
        if (position == 2){
            Intent logger = new Intent(Pull.this, Exercises.class);
            logger.putExtra("exercise", "Seated Row");
            startActivity(logger);
        }
        if (position == 3){
            Intent logger = new Intent(Pull.this, Exercises.class);
            logger.putExtra("exercise", "Bicep Curls");
            startActivity(logger);
        }
        if (position == 4){
            Intent logger = new Intent(Pull.this, Exercises.class);
            logger.putExtra("exercise", "Rear Deltoid");
            startActivity(logger);
        }
        if (position == 5){
            Intent logger = new Intent(Pull.this, Exercises.class);
            logger.putExtra("exercise", "Hammer Curl");
            startActivity(logger);
        }
        if (position == 6){
            Intent logger = new Intent(Pull.this, Exercises.class);
            logger.putExtra("exercise", "Farmers Carry");
            startActivity(logger);
        }
        if (position == 7){
            Intent logger = new Intent(Pull.this, Exercises.class);
            logger.putExtra("exercise", "Bayesian Curl");
            startActivity(logger);
        }
        if (position == 8){
            Intent home = new Intent(Pull.this, HomePage.class);
            startActivity(home);
        }
    }
}
