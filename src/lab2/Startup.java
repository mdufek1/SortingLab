/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

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

//    Song s5 = new Song("Enter Sandman","Metallica","Metallica",1991,5.32);
//    Song s6 = new Song("Enter Sandman","Tests","Metallica",1991,5.32);
//    System.out.println(s4.equals(s6));
//    System.out.println(s4.equals(s5));
        Map<String, Song> map = new HashMap<>();

        map.put(s1.getTitle() + " " + s1.getArtist(), s1);
        map.put(s2.getTitle() + " " + s2.getArtist(), s2);
        map.put(s3.getTitle() + " " + s3.getArtist(), s3);
        map.put(s4.getTitle() + " " + s4.getArtist(), s4);

        Collection values = map.values();

        for (Object s : values) {
            System.out.println((Song) s);
        }

        System.out.println("\n\n");
        Map<String, Song> linkMap = new LinkedHashMap<>();

        linkMap.put(s1.getTitle() + " " + s1.getArtist(), s1);
        linkMap.put(s2.getTitle() + " " + s2.getArtist(), s2);
        linkMap.put(s3.getTitle() + " " + s3.getArtist(), s3);
        linkMap.put(s4.getTitle() + " " + s4.getArtist(), s4);

        values = linkMap.values();

        for (Object s : values) {
            System.out.println((Song) s);
        }

    }
}
