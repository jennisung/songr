package com.jensongr.songr.controller;

import com.jensongr.songr.model.Album;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AlbumController {
    @GetMapping("/albums")
    public String albums(Model model) {
        Album[] albums = {
                new Album("Album 1", "Artist 1", 10, 300, "album1.jpg"),
                new Album("Album 2", "Artist 2", 12, 320, "album2.jpg"),
                new Album("Album 3", "Artist 3", 8, 250, "album3.jpg")
        };
        model.addAttribute("albums", albums);
        return "albums";
    }
}
