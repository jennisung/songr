package com.jensongr.songr.repository;

import com.jensongr.songr.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

//step 4: create repo that extends to JpaRepository
public interface SongRepository extends JpaRepository<Song, Long> {
    //default > save(), delete(), update(), findAll()
    //step 5: add magic method declaration
    public Song findByTitle(String title);

}