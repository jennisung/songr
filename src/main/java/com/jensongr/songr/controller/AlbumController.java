package com.jensongr.songr.controller;

import com.jensongr.songr.model.Album;
import com.jensongr.songr.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AlbumController {

    private final AlbumRepository albumRepository;

    @Autowired
    public AlbumController(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    @GetMapping("/albums")
    public String albums(Model model) {
        List<Album> albums = albumRepository.findAll();
        model.addAttribute("albums", albums);
        return "albums";
    }

    @GetMapping("/addAlbum")
    public String addAlbumForm(Model model) {
        model.addAttribute("album", new Album());
        return "addAlbum";
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
        return "album.html";
    }


}


