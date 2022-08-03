package com.codeclan.example.elvis.controllers;

import com.codeclan.example.elvis.models.Song;
import com.codeclan.example.elvis.repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class SongController {

    @Autowired
    SongRepository songRepository;

    @GetMapping("/songs")
    public ResponseEntity<List<Song>> getAllSongs(){
        return new ResponseEntity<>(songRepository.findAll(), HttpStatus.OK);
    }

}
