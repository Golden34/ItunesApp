package com.example.itunesapp.dto;


public class Cancion {

    private String artistName;
    private int trackId;
    private String trackName;
    private String artworkUrl100;//la URI de la imagen de la portada del disco/canción


    public Cancion ()
    {

    }

    public Cancion(String artistName, int trackId, String trackName) {
        this.artistName = artistName;
        this.trackId = trackId;
        this.trackName = trackName;
        this.artworkUrl100 = artworkUrl100;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getArtworkUrl100() {
        return artworkUrl100;
    }

    public void setArtworkUrl100(String artworkUrl100) {
        this.artworkUrl100 = artworkUrl100;
    }

}