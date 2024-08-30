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

public class Legs extends ComponentActivity implements AdapterView.OnItemClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.leg_exercises);
        ListView listView = findViewById(R.id.leg_list);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long l){
        if (position == 0){
            Intent logger = new Intent(Legs.this, Exercises.class);
            logger.putExtra("exercise", "Seated Leg Curl");
            startActivity(logger);
        }
        if (position == 1){
            Intent logger = new Intent(Legs.this, Exercises.class);
            logger.putExtra("exercise", "Hip Adductor");
            startActivity(logger);
        }
        if (position == 2){
            Intent logger = new Intent(Legs.this, Exercises.class);
            logger.putExtra("exercise", "Hip Abduction");
            startActivity(logger);
        }
        if (position == 3){
            Intent logger = new Intent(Legs.this, Exercises.class);
            logger.putExtra("exercise", "Leg Extension");
            startActivity(logger);
        }
        if (position == 4){
            Intent logger = new Intent(Legs.this, Exercises.class);
            logger.putExtra("exercise", "Squat");
            startActivity(logger);
        }
        if (position == 5) {
            Intent logger = new Intent(Legs.this, Exercises.class);
            logger.putExtra("exercise", "Standing Calf");
            startActivity(logger);
        }
        if (position == 6){
            Intent home = new Intent(Legs.this, HomePage.class);
            startActivity(home);
        }
    }
}
