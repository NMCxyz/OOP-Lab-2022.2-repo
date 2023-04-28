package Lab2;

public import java.util.ArrayList;
import java.util.List;

public class Cart {
    private int qtyOrdered;
    public static final int MAX_NUMBERS_ORDERED = 20;

    private List<DigitalVideoDisc> itemsOrdered;

    public Cart() {
        qtyOrdered = 0;
        itemsOrdered = new ArrayList<>(MAX_NUMBERS_ORDERED);
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if(qtyOrdered > MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full");
            return ;
        } else {
            qtyOrdered++;
            itemsOrdered.add(disc);
            System.out.println("The disc has been added");
        }
        return ;
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        boolean find = false;
        String discName = disc.getTitle();
        for(DigitalVideoDisc item : itemsOrdered) {
            if(item.getTitle().equals(discName)) {
                find = true;
                itemsOrdered.remove(item);
            }
        }
        if(qtyOrdered == 0) {
            System.out.println("Nothing in your cart");
            return ;
        }
        if(find == false) {
            System.out.println("Can't found disc in your cart");
        } else {
            System.out.println("Your item has been removed");
        }
        return ;
    }

    public float totalCost() {
        float sum = 0f;
        for(DigitalVideoDisc item : itemsOrdered) {
            sum += item.getCost();
        }
        return sum;
    }

}