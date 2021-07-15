package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter radius of your circle:");
        radius = input.nextFloat();
        if (radius <= 0) {
            System.out.println("Radius must be greater than zero");
        }else{
        System.out.println("The area of your circle is: " + Circle.getArea(radius));
    }}
}
