package AimsProject.hust.soict.ict.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
    // Initialize the CDSize for add or remove: can be use in addTrack() and removeTrack()
    private static int CDSize = 0;
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<Track>();
    public String getArtist() {
        return artist;
    }
    private void setArtist(String artist) {
        this.artist = artist;
    }
    private ArrayList<Track> getTracks() {
        return tracks;
    }
    private void setTracks(ArrayList<Track> tracks) {
        this.tracks = tracks;
    }

    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("Track already exists");
        } else {
            tracks.add(track);
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
        } else {
            System.out.println("Track does not exist");
        }
    }

    public int getLength() {
        int length = 0;
        for (Track track: tracks) {
            length++;
        }
        return length;
    }

    public void play() {
        for (Track track: tracks) {
            track.play();
        }
    }
}
