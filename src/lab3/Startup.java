/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import lab2.*;
import lab1.Song;
import java.util.*;

/**
 *
 * @author Michael
 */
public class Startup {

    //(String title, String artist, String album, int year, double length)

    public static void main(String[] args) {

        Song s1 = new Song("Jump", "Van Halen", "1984", 1984, 4.03);
        Song s2 = new Song("Come Together", "The Beatles", "Abbey Road", 1969, 4.18);
        Song s3 = new Song("Paranoid", "Black Sabbath", "Paranoid", 1970, 2.53);
        Song s4 = new Song("Enter Sandman", "Metallica", "Metallica", 1991, 5.32);

        Map<String, Song> map = new TreeMap<>();

        map.put(s1.getTitle() + " " + s1.getArtist(), s1);
        map.put(s2.getTitle() + " " + s2.getArtist(), s2);
        map.put(s3.getTitle() + " " + s3.getArtist(), s3);
        map.put(s4.getTitle() + " " + s4.getArtist(), s4);

        Collection<Song> songs = map.values();
        List<Song> list = new ArrayList<Song>(songs);
        Collections.sort(list);
        for (Song s : list) {
            System.out.println(s);
        }

    }
}
