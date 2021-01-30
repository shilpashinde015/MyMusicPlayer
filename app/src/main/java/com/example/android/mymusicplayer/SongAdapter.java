package com.example.android.mymusicplayer;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Songs> {

    public SongAdapter(Context context, ArrayList<Songs> songs) {
        super(context, 0, songs);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Song} object located at this position in the list

        Songs currentsong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID hindisong text_view.
        TextView hindiTextView = (TextView) listItemView.findViewById(R.id.artistname_text_view);
        // the hindisongs TextView.

        hindiTextView.setText(currentsong.getSongName());

        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);

        // the default TextView.
        defaultTextView.setText(currentsong.getArtistName());

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
