/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import lab3.*;
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

        Set<Song> set = new TreeSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        List<Song> list = new ArrayList<>(set);
        for (Song s : list) {
            System.out.println(s);
        }

    }
}
