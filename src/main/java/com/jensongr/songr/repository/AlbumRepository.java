package com.jensongr.songr.repository;

import com.jensongr.songr.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;

//step 4: create repo that extends to JpaRepository
public interface AlbumRepository extends JpaRepository<Album, Long> {
    //default > save(), delete(), update(), findAll()
    //step 5: add magic method declaration
    public Album findByTitle(String title);

}
