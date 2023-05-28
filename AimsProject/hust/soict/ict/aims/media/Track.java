package AimsProject.hust.soict.ict.aims.media;

public class Track implements Playable {
    private int length;
    private String title;

    public int getLength() {
        return this.length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Track(int length, String title) {
        this.length = length;
        this.title = title;
    }
    public void play() {
        System.out.println("Playing Track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
    }
}
