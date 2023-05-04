package Lab2;

//public import java.util.ArrayList;
//import java.util.List;

public class Cart {
    private int qtyOrdered;
    public static final int MAX_NUMBERS_ORDERED = 20;
    private double totalCost;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    public void display(){
        if (qtyOrdered == 0){
            System.out.println("Empty!");
        }
        else{
            for (int i = 0; i < qtyOrdered; i++){
                System.out.println("Name: " + itemsOrdered[i].getTitle() + "; Category: " + itemsOrdered[i].getCategory() + "; Director: " + itemsOrdered[i].getDirector() + "; Length: " + itemsOrdered[i].getLength() + "; Cost: " + itemsOrdered[i].getCost());
            }
        }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered++] = disc;
            System.out.println("The disc " + disc.getTitle() + " has been added.");
        } else {
            System.out.println("The cart is almost full.");
        }
    }
//    Method Overloading
    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
        for (int i = 0; i < dvdList.length; i++){
            if (qtyOrdered < MAX_NUMBERS_ORDERED) {
                itemsOrdered[qtyOrdered++] = dvdList[i];
                System.out.println("The disc " + dvdList[i].getTitle() + " has been added.");
            }else {
                System.out.println("The cart is almost full.");
                break;
            }
        }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered++] = dvd1;
            System.out.println("The disc " + dvd1.getTitle() + " has been added.");
        } else {
            System.out.println("The cart is almost full.");
        }
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                qtyOrdered--;
                for (int j = i; j < qtyOrdered; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                System.out.println("The disc has been removed.");
                return;
            }
        }
        System.out.println("The disc was not found in the cart.");
    }

    public double totalCost() {
        double total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }

    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        float totalCost = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            DigitalVideoDisc disc = itemsOrdered[i];
            System.out.printf("%d. DVD - %s: %s - %s - %d min: %.2f $\n",
                    disc.getId(), disc.getTitle(), disc.getCategory(),
                    disc.getDirector(), disc.getLength(), disc.getCost());
            totalCost += disc.getCost();
        }
        System.out.printf("Total cost: %.2f $\n", totalCost);
        System.out.println("***************************************************");
    }

    public void searchById(int id) {
        for (int i = 0; i < qtyOrdered; i++) {
            DigitalVideoDisc disc = itemsOrdered[i];
            if (disc.getId() == id) {
                System.out.println(itemsOrdered[i].toString());
                return;
            }
        }
        System.out.println("No DVD was found with the specified ID.");
    }

    public void searchByTitle(String title) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
//            DigitalVideoDisc disc = itemsOrdered[i];
//            if (disc.getTitle().equalsIgnoreCase(title)) {
//                System.out.printf("Found DVD: %d. %s - %s - %s - %d min: %.2f $\n",
//                        disc.getId(), disc.getTitle(), disc.getCategory(),
//                        disc.getDirector(), disc.getLength(), disc.getCost());
//                found = true;
//            }
            if (itemsOrdered[i].getTitle().toLowerCase().contains(title.toLowerCase())) {
                System.out.println(itemsOrdered[i].toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No DVD was found with the specified title.");
        }
    }

}
