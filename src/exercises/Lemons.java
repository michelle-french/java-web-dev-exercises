package exercises;

import java.util.Scanner;

public class Lemons {
    public static void main(String[] args) {
        Double miles;
        Double fuel;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter miles driven:");
        miles = input.nextDouble();
        System.out.println("Please fuel consumed:");
        fuel = input.nextDouble();
        System.out.println("Your miles per gallon are: " + miles/fuel);
    }
}
