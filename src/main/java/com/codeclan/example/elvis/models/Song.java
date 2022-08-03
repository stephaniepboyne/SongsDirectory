package com.codeclan.example.elvis.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name= "songs")
public class Song{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name= "title")
    private String title;

    @Column(name="listened")
    private boolean listened;

    @Column(name="personal_rating")
    private int personalRating;

    @Column(name="album_cover_url")
    private String albumCoverURL;

    @Column(name="lyrics")
    private String lyrics;

    @JsonIgnoreProperties({"songs"})
    @ManyToOne
    @JoinColumn(name="songwriter_id", nullable=false)
    private Songwriter songwriter;

    @JsonIgnoreProperties({"songs"})
    @ManyToOne
    @JoinColumn(name="album_id", nullable=false)
    private Album album;

    public Song(String title, boolean listened, int personalRating, String albumCoverURL, String lyrics, Songwriter songwriter, Album album) {
        this.title = title;
        this.listened = listened;
        this.personalRating = personalRating;
        this.albumCoverURL = albumCoverURL;
        this.lyrics = lyrics;
        this.songwriter = songwriter;
        this.album = album;
    }

    public Song() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isListened() {
        return listened;
    }

    public void setListened(boolean listened) {
        this.listened = listened;
    }

    public int getPersonalRating() {
        return personalRating;
    }

    public void setPersonalRating(int personalRating) {
        this.personalRating = personalRating;
    }

    public String getAlbumCoverURL() {
        return albumCoverURL;
    }

    public void setAlbumCoverURL(String albumCoverURL) {
        this.albumCoverURL = albumCoverURL;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    public Songwriter getSongwriter() {
        return songwriter;
    }

    public void setSongwriter(Songwriter songwriter) {
        this.songwriter = songwriter;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
}


