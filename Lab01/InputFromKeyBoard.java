package Lab01;

import java.util.Scanner;

public class InputFromKeyBoard {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What's your name?");
        String strName = keyboard.nextline();
        System.out.println("How old are you?");
        int iAge = keyboard.nextInt();
        double dHeight = keyboard.nextDouble();

        System.out.println("Mrs/MS. "+strName+", "+iAge+" years old. "+ "Your height is "+dHeight+".");
    }
}
