package com.example.android.mymusicplayer;

public class Songs {

    /**
     * Default artistname
     */
    private String artistName;

    /**
     * songname
     */
    private String songName;

    //Create a new song object intialise the state of object.
    public Songs(String artistName, String songName) {

        this.artistName = artistName;
        this.songName = songName;
    }

    /**
     * Get the artistname.
     */
    public String getArtistName() {

        return this.artistName;
    }

    /**
     * Get the songname.
     */
    public String getSongName() {
        return songName;
    }
}
