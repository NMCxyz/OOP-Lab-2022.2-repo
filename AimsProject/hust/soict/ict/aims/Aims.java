package AimsProject.hust.soict.ict.aims;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

import AimsProject.hust.soict.ict.aims.media.*;
import AimsProject.hust.soict.ict.aims.cart.Cart;
import AimsProject.hust.soict.ict.aims.store.Store;

import static AimsProject.hust.soict.ict.aims.media.Media.COMPARE_BY_COST_TITLE;

public class Aims {
    // Menu M
    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }
// // Menu M1
    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }
// // // Menu M1.1
    public static void mediaDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }
// // Menu M2
    public static void updateStoreMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add a media");
        System.out.println("2. Remove a media");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }
// // Menu M3
    public static void cartMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }


    public static void main(String[] args) {
        Store store = new Store();
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",	"Animation",		"Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",		"Science Fiction",	"George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",			"Animation", 		18.99f);

        cart.addMedia(dvd1);
        cart.addMedia(dvd2);
        cart.addMedia(dvd3);

        System.out.println("Total Cost: " + cart.totalCost());

        cart.removeMedia(dvd2);
        System.out.println("Total Cost after removing Star Wars 24.95: " + cart.totalCost() +"\n");

        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Avatar", "Science Fiction", "James Cameron", 192, 12.44f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Avatar: Way of the Water", "Science Fiction", "James Cameron", 27.98f);
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("Top Gun: Maverick", "Action", 22.25f);
        DigitalVideoDisc dvd7 = new DigitalVideoDisc("Everything Everywhere All at Once", "Comedy", "Daniel Kwan", 139, 46.23f);
        DigitalVideoDisc dvd8 = new DigitalVideoDisc("Uncharted", "Adventure", 25.85f);
        DigitalVideoDisc dvd9 = new DigitalVideoDisc("Jurassic World: Dominion", "Action", 147, 36.77f);
        DigitalVideoDisc dvd10 = new DigitalVideoDisc("The Father", "Drama", 97, 25.9f);
        DigitalVideoDisc dvd11 = new DigitalVideoDisc("Judas and the Black Messiah", "Crime", 45.98f);
        DigitalVideoDisc dvd12 = new DigitalVideoDisc("CODA", "Comedy", 38.25f);
        DigitalVideoDisc dvd13 = new DigitalVideoDisc("Cruella", "Crime", "Craig Gillespie", 134, 35.55f);
        DigitalVideoDisc dvd14 = new DigitalVideoDisc("Black Panther", "Action", 47.6f);
        DigitalVideoDisc dvd15 = new DigitalVideoDisc("Parasite", "Thriller", "Bong Joon-ho", 132, 19.42f);
        DigitalVideoDisc dvd16 = new DigitalVideoDisc("Promising Young Woman");
        DigitalVideoDisc dvd17 = new DigitalVideoDisc("La La Land", "Romance, Musical", 19.66f);
        DigitalVideoDisc dvd18 = new DigitalVideoDisc("Soul", "Animation", 101, 46.96f);
        DigitalVideoDisc dvd19 = new DigitalVideoDisc("Joker", "Thriller", 122, 30f);
        DigitalVideoDisc dvd20 = new DigitalVideoDisc("Toy Story 4", "Animation", 100, 17.01f);

        DigitalVideoDisc[] dvdlist = new DigitalVideoDisc[]{
                dvd1, dvd2, dvd3, dvd4, dvd5,
                dvd6, dvd7, dvd8, dvd9, dvd10,
                dvd11, dvd12, dvd13, dvd14, dvd15,
                dvd16, dvd17, dvd18, dvd19, dvd20
        };
//        Collections.sort(dvdlist, Media.COMPARE_BY_COST_TITLE);

        for (int i = 0; i < dvdlist.length; i++) {
            store.addMedia(dvdlist[i]);
        }

        Scanner scanner = new Scanner(System.in);
        int choice;
        do{
            showMenu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1. View store");
                    store.displayStore();
                    do {
                        storeMenu();
                        choice = scanner.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("1. See a media’s details");
                                System.out.println("Please enter the name of the media that you want to view: ");
                                String name1 = scanner.nextLine();
                                if (store.searchByTitleToDo(name1) != -1){
                                    int index = store.searchByTitleToDo(name1);
                                    System.out.println("Found :");
                                    store.displayItem(index);
                                    do {
                                        mediaDetailsMenu();
                                        choice = scanner.nextInt();
                                        switch (choice) {
                                            case 1:
                                                System.out.println("1. Add to cart");
                                                cart.addMedia(dvdlist[index]);
                                                break;
                                            case 2:
                                                System.out.println("2. Play");
                                                dvdlist[index].play();
                                                break;
                                            case 0:
                                                System.out.println("0. Back");
                                                break;
                                            default:
                                                System.out.println("Invalid choice");
                                                break;
                                        }
                                    } while (choice != 0);
                                }else
                                    break;
                            case 2:
                                System.out.println("2. Add a media to cart");
                                System.out.println("Please enter the name of the media that you want to add: ");
                                String name2 = scanner.nextLine();
                                cart.addMedia(dvdlist[store.searchByTitleToDo(name2)]);
//                                if (cart.searchTitleToDo(name2) != -1){
//                                    cart.searchByTitle(name2);
//                                    System.out.println("That media exists, do you want to add it? (Y/N)");
//
//                                }else
//                                    break;
                            case 3:
                                System.out.println("3. Play a media");
                                System.out.println("Please enter the name of the media that you want to play: ");
                                String name3 = scanner.nextLine();
                                if (store.searchByTitleToDo(name3) != -1){
                                    dvdlist[store.searchByTitleToDo(name3)].play();
                                }else{
                                    System.out.println("That media does not exist");
                                    break;
                                }
                                break;
                            case 4:
                                System.out.println("4. See current cart");
                                cart.printCart();
                                break;
                            case 0:
                                System.out.println("0. Back");
                                break;
                            default:
                                System.out.println("Invalid choice");
                                break;
                        }
                    }while (choice != 0);
                    break;
                case 2:
                    System.out.println("2. Update store");
                    break;
                case 3:
                    System.out.println("3. See current cart");
                    cart.printCart();
                    do {
                        cartMenu();
                        choice = scanner.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("1. Filter medias in cart");
                                System.out.println("Do you want to filter by title or id? (T/I)");
                                String choice1 = scanner.nextLine();
                                if (choice1.equals("T")){
                                    cart.filterByTitle();
                                }else if (choice1.equals("I")) {
                                    cart.filterById();
                                }else {
                                    System.out.println("Invalid choice");
                                    break;
                                }
                                break;
                            case 2:
                                System.out.println("2. Sort medias in cart");
                                System.out.println("Do you want to sort by title or cost? (T/C)");
                                String choice2 = scanner.nextLine();
                                if (choice2.equals("T")){
                                    cart.filterByTitle();
                                }else if (choice2.equals("C")) {
                                    cart.sortByCost();
                                }else {
                                    System.out.println("Invalid choice");
                                    break;
                                }
                                break;
                            case 3:
                                System.out.println("3. Remove media from cart");
                                System.out.println("Please enter the name of the media that you want to remove: ");
                                String name5 = scanner.nextLine();
                                if (cart.searchTitleToDo(name5) != -1) {
                                    cart.removeMedia(dvdlist[cart.searchTitleToDo(name5)]);
                                }else {
                                    System.out.println("That media does not exist");
                                    break;
                                }
                                break;
                            case 4:
                                System.out.println("4. Play a media");
                                System.out.println("Please enter the name of the media that you want to play: ");
                                String name6 = scanner.nextLine();
                                if (cart.searchTitleToDo(name6) != -1) {
                                    dvdlist[cart.searchTitleToDo(name6)].play();
                                }else {
                                    System.out.println("That media does not exist");
                                    break;
                                }
                                break;
                            case 5:
                                System.out.println("5. Place order");
                                break;
                            case 0:
                                System.out.println("0. Back");
                                break;
                            default:
                                System.out.println("Invalid choice");
                                break;
                        }
                    }while (choice != 0);

                    break;
                case 0:
                    System.out.println("0. Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 0);


//        // Create a new cart
//        Cart anOrder = new Cart();
//
//        // Create  new dvd objects and add them to the cart
//        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
//        anOrder.addMedia(dvd1);
//
//        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
//        anOrder.addMedia(dvd2);
//
//        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
//        anOrder.addMedia(dvd3);
//
//        anOrder.printCart();
//        // print total cost of the items in the cart
//        System.out.println("Total Cost is:");
//        System.out.println(anOrder.totalCost());
//
//        anOrder.removeMedia(dvd3);
//        anOrder.printCart();
    }
}
