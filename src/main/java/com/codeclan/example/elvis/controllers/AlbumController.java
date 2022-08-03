package com.codeclan.example.elvis.controllers;

import com.codeclan.example.elvis.models.Album;
import com.codeclan.example.elvis.repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class AlbumController {

    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/albums")
    public ResponseEntity<List<Album>>getAllAlbums(){
        return new ResponseEntity<>(albumRepository.findAll(), HttpStatus.OK);
    }
}
