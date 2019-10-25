package com.example.itunesapp.dto;

//import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.itunesapp.R;

public class CancionViewHolder extends RecyclerView.ViewHolder {

    private TextView text_view_artistName;
    private TextView text_view_trackId;
    private TextView text_view_trackName;

    public CancionViewHolder(View itemView) {

        super(itemView);
        text_view_artistName = (TextView)itemView.findViewById(R.id.Lbl_artistName);
        text_view_trackId = (TextView)itemView.findViewById(R.id.Lbl_trackId);
        text_view_trackName = (TextView)itemView.findViewById(R.id.Lbl_trackName);
    }

    public void cargarLibroEnHolder(Cancion c) {
        text_view_artistName.setText(c.getArtistName());
        text_view_trackId.setText(c.getTrackId());
        text_view_trackName.setText(c.getTrackName());
    }
}
