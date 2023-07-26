package com.jensongr.songr.controller;

import com.jensongr.songr.model.Album;
import com.jensongr.songr.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
}




//three albums
//import com.jensongr.songr.model.Album;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//@Controller
//public class AlbumController {
//    @GetMapping("/albums")
//    public String albums(Model model) {
//        Album[] albums = {
//                new Album("Channel Orange", "Frank Ocean", 17, 62 * 60 + 18, "channel_orange.jpeg"),
//                new Album("AM", "Arctic Monkeys", 12, 41 * 60 + 38, "am.jpg"),
//                new Album("Sawayama", "Rina Sawayama", 13, 43 * 60, "sawayama.png")
//        };
//        model.addAttribute("albums", albums);
//        return "album.html";
//    }
//}
