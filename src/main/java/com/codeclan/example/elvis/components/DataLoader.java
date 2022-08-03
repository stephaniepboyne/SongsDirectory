package com.codeclan.example.elvis.components;

import com.codeclan.example.elvis.repositories.AlbumRepository;
import com.codeclan.example.elvis.repositories.SongRepository;
import com.codeclan.example.elvis.repositories.SongwriterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader {

    @Autowired
    AlbumRepository albumRepository;

    @Autowired
    SongRepository songRepository;

    @Autowired
    SongwriterRepository songwriterRepository;



}
