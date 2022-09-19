package com.example.fun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageButton buttonStart;
    private TextView showTextView;



    Random random = new Random();
    int amountCup = random.nextInt(11);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonStart = findViewById(R.id.startButton);
        showTextView = findViewById(R.id.showText);
    }




}