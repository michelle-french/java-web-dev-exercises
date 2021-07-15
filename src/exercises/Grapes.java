package exercises;

import java.util.Scanner;

public class Grapes {
    public static void main(String[] args) {
        double length;
        double width;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter rectangle length:");
        length = input.nextFloat();
        System.out.println("Please enter rectangle width:");
        width = input.nextFloat();
        System.out.println("Your rectangle area is: " + length*width);
    }
}
