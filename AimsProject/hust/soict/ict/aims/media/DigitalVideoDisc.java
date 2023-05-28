package AimsProject.hust.soict.ict.aims.media;

public class DigitalVideoDisc extends Disc {
    private static int nbDigitalVideoDiscs = 0;

    public DigitalVideoDisc(String title) {
        this.setId(++nbDigitalVideoDiscs);
    }
    public DigitalVideoDisc(String title, String category, float cost) {
        this.setId(++nbDigitalVideoDiscs);
    }
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.setId(++nbDigitalVideoDiscs);
    }

    public DigitalVideoDisc(String title, String category, int length, float cost) {
        this.setId(++nbDigitalVideoDiscs);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.setId(++nbDigitalVideoDiscs);
    }
    public String toString() {
        return "DVD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + this.getLength() + ": " + this.getCost() + " $";
    }
    public boolean isMatch(String title) {
        return this.getTitle().equals(title);
    }
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}
