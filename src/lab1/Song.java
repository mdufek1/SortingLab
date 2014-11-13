package lab1;

import java.util.Objects;
import org.apache.commons.lang3.builder.CompareToBuilder;

public class Song implements Comparable<Song> {

    private String title;
    private String artist;
    private String album;
    private int year;
    private double length;

    public Song(String title, String artist, String album, int year, double length) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.year = year;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.title);
        hash = 97 * hash + Objects.hashCode(this.artist);
        hash = 97 * hash + this.year;
        return hash;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Song other = (Song) obj;
        return (Objects.equals(this.title, other.title) && Objects.equals(this.artist, other.artist) && Objects.equals(this.year, other.year));
    }

//    @Override
//    public String toString() {
//        return "Song: " + title + " By: " + artist + ", from their album: " + album + " was released in " + year + " and has a run time of " + length + " minutes.";
//
//    }

    @Override
    public String toString() {
        return "Song: " + title + ".\n\tBy: " + artist + ".\n\tAlbum: " + album + ".\n\tRelease Year:" + year + ".\n\tRuntime: " + length + " Minutes.";

    }
    @Override
    public int compareTo(Song s) {
        final int BEFORE = -1;
        final int EQUAL = 0;
        final int AFTER = 1;
        if (this.year < s.getYear()) {
            return BEFORE;
        } else if (this.year > s.getYear()) {
            return AFTER;
        } else {
            return EQUAL;
        }
    }

//    @Override
//    public int compareTo(Song s) {
//        return new CompareToBuilder()
//               .append(this.year, s.year)
//               .toComparison();
//    }
}
