package com.codeclan.example.elvis.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "albums")
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="title")
    private String title;

    @Column(name="release_date")
    private String releaseDate;

    @Column(name="listened")
    private boolean listened;

    @Column(name="personal_rating")
    private int personalRating;

    @Column(name="album_cover_url")
    private String albumCoverURL;

    @JsonIgnoreProperties({"album"})
    @OneToMany(mappedBy="album")
    private List<Song> songs;

    public Album(String title, String releaseDate, boolean listened, int personalRating, String albumCoverURL){
        this.title = title;
        this.releaseDate = releaseDate;
        this.listened = listened;
        this.personalRating = personalRating;
        this.albumCoverURL = albumCoverURL;

    }

    public Album(){
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

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
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

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }
}
