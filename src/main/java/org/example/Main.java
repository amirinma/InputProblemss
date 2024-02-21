package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String name;
        int age;
        double income;

        // create a scanner object to read input
        Scanner keyboard = new Scanner(System.in);
        // get the user's age
        System.out.println("What is your age?");
        age = keyboard.nextInt();
        // get the user's income
        System.out.println("What is your annual income");
        income = keyboard.nextDouble();

        // get the user's name
        System.out.println("What is your name?");
        name = keyboard.nextLine();
        // display the information back to the user
        System.out.println("Hello " + name + " your age is " + age + " and your income is $ " + income);
    }
}