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

    public Song {

    }
}


