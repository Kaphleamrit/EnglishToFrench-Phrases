package com.example.basicphrases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleClick(View view) {
     Button btn = (Button) view;
     String nameOfFile = "a" + btn.getTag().toString();
     MediaPlayer mediaPlayer = MediaPlayer.create(this,getResources().getIdentifier(nameOfFile,"raw",getPackageName()));
     mediaPlayer.start();
        }
    }
