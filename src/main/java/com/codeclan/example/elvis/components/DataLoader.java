package com.codeclan.example.elvis.components;

import com.codeclan.example.elvis.models.Album;
import com.codeclan.example.elvis.models.Song;
import com.codeclan.example.elvis.models.Songwriter;
import com.codeclan.example.elvis.repositories.AlbumRepository;
import com.codeclan.example.elvis.repositories.SongRepository;
import com.codeclan.example.elvis.repositories.SongwriterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.persistence.criteria.From;

@Component
public class DataLoader implements ApplicationRunner{

    @Autowired
    AlbumRepository albumRepository;

    @Autowired
    SongRepository songRepository;

    @Autowired
    SongwriterRepository songwriterRepository;

    public DataLoader(){};

    public void run(ApplicationArguments args){

        Songwriter songwriter = new Songwriter("Carl Perkins");
        songwriterRepository.save(songwriter);

        Album album = new Album("Elvis Presley", "13 March 1956", false, 0, "https://m.media-amazon.com/images/I/71MwhnTfbLS._AC_SX679_.jpg");
        albumRepository.save(album);

        Song song = new Song("Blue Suede Shoes", false, 0, album.getAlbumCoverURL(), "https://genius.com/Elvis-presley-blue-suede-shoes-lyrics", songwriter, album);
        songRepository.save(song);

    }


}