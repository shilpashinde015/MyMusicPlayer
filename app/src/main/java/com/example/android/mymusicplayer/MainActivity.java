package com.example.android.mymusicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the hindisong category
        TextView hindisongs = (TextView) findViewById(R.id.hindisongs);
        TextView englishsongs = (TextView) findViewById(R.id.englishsongs);
        hindisongs.setOnClickListener((View.OnClickListener) this);
        englishsongs.setOnClickListener((View.OnClickListener) this);

    }


    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            // Create a new intent to open the {@link hindisongActivity}
            case R.id.hindisongs:
                Intent hindisongIntent = new Intent(MainActivity.this, HindiSongs.class);
                // Start the new activity
                startActivity(hindisongIntent);
                break;
            case R.id.englishsongs:
                // Create a new intent to open the {@link englishsongActivity}
                Intent hindiSongIntent = new Intent(MainActivity.this, EnglishSong.class);

                // Start the new activity
                startActivity(hindiSongIntent);
                break;

        }
    }
}
