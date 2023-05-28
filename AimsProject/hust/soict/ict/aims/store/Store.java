package AimsProject.hust.soict.ict.aims.store;

import AimsProject.hust.soict.ict.aims.media.*;

import java.util.ArrayList;

public class Store {
    public static final int MAX_STORE_SIZE = 100;
    private static int storeSize = 0;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    public int getStoreSize() {
        return storeSize;
    }

    public void addMedia(Media item){
        if (storeSize == MAX_STORE_SIZE){
            System.out.println("The store is almost full");
        }
        else{
            itemsOrdered.add(item);
            storeSize++;
            System.out.println("The disc has been added");
        }
    }
    public void removeMedia(Media item){
        if (storeSize == 0){
            System.out.println("The store is empty");
        }
        else{
            itemsOrdered.remove(item);
            storeSize--;
            System.out.println("The disc has been removed");
        }
    }

    public void displayStore() {
        System.out.println("***********************STORE***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < storeSize; i++) {
            System.out.println(i+1 + ". DVD - " + itemsOrdered.get(i).getTitle() + " - " + itemsOrdered.get(i).getCategory() + ": " + itemsOrdered.get(i).getCost() + "$");
        }
        System.out.println("***************************************************");
    }

}