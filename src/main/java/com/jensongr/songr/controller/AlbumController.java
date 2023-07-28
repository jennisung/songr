package com.jensongr.songr.controller;

import com.jensongr.songr.model.Album;
import com.jensongr.songr.model.Song;
import com.jensongr.songr.repository.AlbumRepository;
import com.jensongr.songr.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class AlbumController {

    private final AlbumRepository albumRepository;
    private final SongRepository songRepository;


    @Autowired
    public AlbumController(AlbumRepository albumRepository, SongRepository songRepository) {
        this.albumRepository = albumRepository;
        this.songRepository = songRepository;
    }



    @GetMapping("/albums")
    public String albums(Model model) {
        List<Album> albums = albumRepository.findAll();
        model.addAttribute("albums", albums);
        return "albums.html";
    }

    @GetMapping("/addAlbum")
    public String addAlbumForm(Model model) {
        model.addAttribute("album", new Album());
        return "addAlbum.html";
    }

    @PostMapping("/addAlbum")
    public String addAlbumSubmit(@ModelAttribute Album album) {
        albumRepository.save(album);
        return "redirect:/albums";
    }


    //lab 13
    @GetMapping("/{id}")
    public String getAlbum(Model model, @PathVariable Long id) {
        Album album = albumRepository.getById(id);
        model.addAttribute("album", album);
        return "albums";
    }

    @PostMapping("/addAlbum/{id}")
    public RedirectView addSongToAlbum(
            @PathVariable Long id,
            String title,
            int songLength,
            int trackNumber
    ) {
        Album album = albumRepository.findById(id).orElse(null);
        if (album != null) {
            Song song = new Song(title, songLength, trackNumber, album);
            songRepository.save(song);
        }
        return new RedirectView("/albums/" + id);
    }
}


//    @PostMapping("/addAlbum/{id}")
//    public RedirectView addSong(String title, Integer length, Integer trackNumber, String album) {
//        Album savedAlbum = albumRepository.findByTitle(album);
//
//        if (savedAlbum == null) {
//            String id = null;
//            throw new IllegalArgumentException("Album with id not found.");
//        }
//        Song addSong = new Song(title, trackNumber, album);
//        AlbumRepository.save(addSong);
//
//        return new RedirectView("/" + savedAlbum.getId());
//    }
//
//    @PostMapping("/addAlbum/{id}")
//    public RedirectView addSong(
//            @RequestParam String title,
//            @RequestParam Integer length,
//            @RequestParam Integer trackNumber,
//            @PathVariable Long id
//    ) {
//        Album savedAlbum = albumRepository.findById(id).orElseThrow(
//                () -> new IllegalArgumentException("Album not found.")
//        );
//
//        Song addSong = new Song(title, length, trackNumber, savedAlbum);
//        songRepository.save(addSong);
//
//        return new RedirectView("/" + savedAlbum.getId());
//    }




