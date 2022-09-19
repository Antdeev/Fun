package com.example.fun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageButton buttonStart;
    private TextView showTextView;
    public ImageButton buttonStartGame;
    private TextView textCup;
    int test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonStart = findViewById(R.id.startButton);
        showTextView = findViewById(R.id.showText);
        textCup = findViewById(R.id.textcup);
        buttonStartGame = findViewById(R.id.startgamebutton);
        MediaPlayer speakMalo = MediaPlayer.create(this, R.raw.malo1);
        MediaPlayer speakKakEubu = MediaPlayer.create(this, R.raw.kakeubu);
        MediaPlayer primatWin = MediaPlayer.create(this, R.raw.primatwin);
        Random random = new Random();
        String[] arraysQuote = getResources().getStringArray(R.array.qoute);
        int sizeArrayQoute = arraysQuote.length;

        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int amountCup = random.nextInt(11);
                int randomResFromArrays = random.nextInt(sizeArrayQoute);
                if (amountCup == 0) { textCup.setText(String.valueOf(amountCup) + "" + "! хуй тебе");}
                if (amountCup == 1) { textCup.setText(String.valueOf(amountCup) + " " + "стакан!") ;}
                if ((amountCup > 2) && (amountCup <= 4) ) { textCup.setText(String.valueOf(amountCup) + " " + "стаканa!") ;}
                if (amountCup > 5)  { textCup.setText(String.valueOf(amountCup) + " " + "стаканов!") ;}
//test
                if (amountCup <= 5){ speakMalo.start();}
                if (amountCup == 10) { primatWin.start();}
                else  if ((amountCup >= 6) && (amountCup < 10) ) {speakKakEubu.start();}
                showTextView.setText(arraysQuote[randomResFromArrays]);
            }
        });

            }

    public void startGame(View view) {
            switch (view.getId()){
                case R.id.startgamebutton:
                    Intent startGameIntent = new Intent(this, GameActivity.class);
                    startActivity(startGameIntent);
                    break;
                default:
                    break;
            }


    }
}




