package com.example.musicplayerapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mp;
    public Button button1;
    public Button button2;
    public ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void radio_Click(View view) {
        img = findViewById(R.id.icon);
        button1 = findViewById(R.id.pause);
        button2 = findViewById(R.id.play);
        if (view.getId() == R.id.song1) {
            button1.setVisibility(View.VISIBLE);
            button2.setVisibility(View.VISIBLE);
            img.setImageResource(R.drawable.beethoven);
            stopPlaying();
            mp = MediaPlayer.create(MainActivity.this, R.raw.beethoven);
            mp.start();

        } else if (view.getId() == R.id.song2) {
            button1.setVisibility(View.VISIBLE);
            button2.setVisibility(View.VISIBLE);
            img.setImageResource(R.drawable.haydn);
            stopPlaying();
            mp = MediaPlayer.create(MainActivity.this, R.raw.haydn);
            mp.start();
        } else {
            button1.setVisibility(View.VISIBLE);
            button2.setVisibility(View.VISIBLE);
            img.setImageResource(R.drawable.tchaikovsky);
            stopPlaying();
            mp = MediaPlayer.create(MainActivity.this, R.raw.tchaikovsky);
            mp.start();
        }
    }



    private void stopPlaying() {
        if (mp != null) {
            mp.stop();
            mp.release();
            mp = null;
        }
    }

    public void button_click1(View view) throws IOException {
        mp.stop();
        mp.prepare();
    }


    public void button_click2(View view) throws IOException {
        mp.stop();
        mp.prepare();
        mp.start();
    }
}