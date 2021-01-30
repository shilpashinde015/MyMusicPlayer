package com.example.android.mymusicplayer;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class EnglishSong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_song);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        //Create the list of English songs
        ArrayList<Songs> songs = new ArrayList<Songs>();
        Resources artistresource = getResources();
        String[] artistname = artistresource.getStringArray(R.array.english_artist);
        for (int i = 0; i < artistname.length; i++) {
            System.out.println("artist" + artistname[i]);
        }

        Resources songresource = getResources();
        String[] songname = songresource.getStringArray(R.array.english_songs);
        for (int i = 0; i < songname.length; i++) {
            System.out.println("artist" + songname[i]);
        }

        for (int i = 0; i < artistname.length; i++) {
            songs.add(new Songs(artistname[i].toString(), songname[i].toString()));
        }

        //Create song adapter
        SongAdapter adapter = new SongAdapter(this, songs);


        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
