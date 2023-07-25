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
                new Album("Channel Orange", "Frank Ocean", 17, 62 * 60 + 18, "channel_orange.jpeg"),
                new Album("AM", "Arctic Monkeys", 12, 41 * 60 + 38, "am.jpg"),
                new Album("Sawayama", "Rina Sawayama", 13, 43 * 60, "sawayama.png")
        };
        model.addAttribute("albums", albums);
        return "album";
    }
}
