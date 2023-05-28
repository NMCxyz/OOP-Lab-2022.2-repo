package AimsProject.hust.soict.ict.aims.cart;

import AimsProject.hust.soict.ict.aims.media.*;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    public static final int MAX_NUMBERS_ORDERED = 20;
    private double total;
    private static int size = 0;
    public int qtyOrdered() {
        return size;
    }
    public void addMedia(Media item){
        if (size == MAX_NUMBERS_ORDERED){
            System.out.println("The order is almost full");
        }
        else{
            itemsOrdered.add(item);
            size++;
            System.out.println("The disc has been added");
        }
    }
    public void removeMedia(Media item){
        if (size == 0){
            System.out.println("The order is empty");
        }
        else{
            itemsOrdered.remove(item);
            size--;
            System.out.println("The disc has been removed");
        }
    }
    public void printCart(){
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < size; i++) {
            System.out.println(i+1 + ". DVD - " + itemsOrdered.get(i).getTitle() + " - " + itemsOrdered.get(i).getCategory()  + ": " + itemsOrdered.get(i).getCost() + "$");
        }
        System.out.println("Total cost: " + totalCost() + "$");
        System.out.println("***************************************************");
    }

    public double totalCost() {
        double total = 0;
        for (int i = 0; i < size; i++) {
            total += itemsOrdered.get(i).getCost();
        }
        return total;
    }


    public void searchByID(int id) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            DigitalVideoDisc disc = (DigitalVideoDisc) itemsOrdered.get(i);
            if (disc.getId() == id) {
                System.out.printf("Found DVD: %d. %s - %s - %s - %d min: %.2f $\n",
                        disc.getId(), disc.getTitle(), disc.getCategory(),
                        disc.getDirector(), disc.getLength(), disc.getCost());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No DVD was found with the specified ID.");
        }
    }

    public void searchByTitle(String title) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            DigitalVideoDisc disc = (DigitalVideoDisc) itemsOrdered.get(i);
            if (disc.getTitle().equals(title)) {
                System.out.printf("Found DVD: %d. %s - %s - %s - %d min: %.2f $\n",
                        disc.getId(), disc.getTitle(), disc.getCategory(),
                        disc.getDirector(), disc.getLength(), disc.getCost());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No DVD was found with the specified title.");
        }
    }

}
