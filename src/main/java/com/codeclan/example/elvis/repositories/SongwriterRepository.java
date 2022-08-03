package com.codeclan.example.elvis.repositories;

import com.codeclan.example.elvis.models.Album;
import com.codeclan.example.elvis.models.Songwriter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongwriterRepository extends JpaRepository<Songwriter, Long> {
}
