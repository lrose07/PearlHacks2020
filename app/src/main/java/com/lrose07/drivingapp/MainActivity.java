package com.lrose07.drivingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("mainActivity onCreate");


        Button btn = findViewById(R.id.button);
//        btn.setOnClickListener(e -> launchMap());

        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);

    }

    private void launchMap() {

    }

}
