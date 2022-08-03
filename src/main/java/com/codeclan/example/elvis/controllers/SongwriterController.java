package com.codeclan.example.elvis.controllers;

import com.codeclan.example.elvis.models.Songwriter;
import com.codeclan.example.elvis.repositories.SongRepository;
import com.codeclan.example.elvis.repositories.SongwriterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class SongwriterController {

    @Autowired
    SongwriterRepository songwriterRepository;

    @GetMapping("/songwriters")
    public ResponseEntity<List<Songwriter>> getAllSongwriters(){
        return new ResponseEntity<>(songwriterRepository.findAll(), HttpStatus.OK);
    }

}
