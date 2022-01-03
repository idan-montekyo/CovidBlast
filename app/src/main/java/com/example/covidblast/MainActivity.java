package com.example.covidblast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MusicPlayer player = MusicPlayer.getInstance();
        player.initialize(this);
        player.play(true);
    }
}

// Syringe
// Ball -> SurpriseBall
// Bullet
// Level (level num, difficulty(1/2/3), )

// Background ?
// MusicPlayer ?
//