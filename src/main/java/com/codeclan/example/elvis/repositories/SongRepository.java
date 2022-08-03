package com.codeclan.example.elvis.repositories;

import com.codeclan.example.elvis.models.Album;
import com.codeclan.example.elvis.models.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepository extends JpaRepository<Song, Long> {
}
