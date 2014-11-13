/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.Comparator;
import lab1.Song;
import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 *
 * @author mdufek1
 */
public class SongByTitle implements Comparator<Song> {

    @Override
    public int compare(Song s1, Song s2) {
        return new CompareToBuilder()
                .append(s1.getTitle(), s2.getTitle())
                .toComparison();
    }

}
