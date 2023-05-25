package Lab1;
import java.util.Scanner;

public class InputFromKeyBoard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.next();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Your name is " + name + " and you are " + age + " years old.");
    }
}
