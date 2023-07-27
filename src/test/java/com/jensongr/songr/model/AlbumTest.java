//package com.jensongr.songr.model;
//
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class AlbumTest {
//
//    @Test
//    public void testAlbumConstructorAndGetters() {
//        Album album = new Album("AM", "Arctic Monkeys", 10, 300, "image.jpg");
//
//        assertEquals("AM", album.getTitle());
//        assertEquals("Arctic Monkeys", album.getArtist());
//        assertEquals(10, album.getSongCount());
//        assertEquals(300, album.getLength());
//        assertEquals("image.jpg", album.getImageUrl());
//    }
//
//    @Test
//    public void testAlbumSetters() {
//        Album album = new Album("AM", "Arctic Monkeys", 10, 300, "image.jpg");
//
//        album.setTitle("Sawayama");
//        album.setArtist("Rina");
//        album.setSongCount(15);
//        album.setLength(400);
//        album.setImageUrl("new_image.jpg");
//
//        assertEquals("Sawayama", album.getTitle());
//        assertEquals("Rina", album.getArtist());
//        assertEquals(15, album.getSongCount());
//        assertEquals(400, album.getLength());
//        assertEquals("new_image.jpg", album.getImageUrl());
//    }
//}
