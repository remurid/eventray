package com.example.myapplication001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import static com.example.myapplication001.R.layout.activity_main;

public class MainActivity extends AppCompatActivity {


    Button joinButton;
    Button createButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);
        init();
    }

    private void init() {

        joinButton= findViewById(R.id.joinButton);
        createButton= findViewById(R.id.createButton);
    }


}
