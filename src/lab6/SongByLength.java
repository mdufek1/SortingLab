/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab6;

import java.util.Comparator;
import lab1.Song;

/**
 *
 * @author mdufek1
 */
public class SongByLength implements Comparator<Song> {

    @Override
    public int compare(Song s1, Song s2) {
        final int BEFORE = -1;
        final int EQUAL = 0;
        final int AFTER = 1;
        if (s1.getLength() < s2.getLength()) {
            return AFTER;
        } else if (s1.getLength() > s2.getLength()) {
            return BEFORE;
        } else {
            return EQUAL;
        }
    }
 

       
}
