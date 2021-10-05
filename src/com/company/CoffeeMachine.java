package com.company;

import java.util.Locale;
import java.util.Scanner;

public class CoffeeMachine {


    Scanner scanner = new Scanner(System.in);


    private int coffeeCount;
    private double water;
    private double milk;
    private double coffeePowder;

    public CoffeeMachine(int coffeeCount, double water, double milk, double coffeePowder) {
        this.coffeeCount = coffeeCount;
        this.water = water;
        this.milk = milk;
        this.coffeePowder = coffeePowder;
    }


    public void fillIngredient() {
        this.water = 2.0;
        this.milk = 2.0;
        this.coffeePowder = 500.0;

    }

    public void cleanMachine() {

        this.water = 0.0;
        this.milk = 0.0;
        this.coffeePowder = 0.0;
    }

    public void aCoffe() {  //TODO

        this.water -= 0.2;
        this.milk -= 0.2;
        this.coffeePowder -= 20;
        this.coffeeCount++;
        menu();
    }

    public void start() {
        System.out.println("Want to Start Machine - Y or N?");
        String menuChoiceString = scanner.next();
        switch (menuChoiceString.toLowerCase(Locale.ROOT)) {
            case "y":
                System.out.println("COFFEE MACHINE");
                menu();
                break;
            case "n":
                System.out.println("Closing the Coffee Machine!");
                break;
        }
    }


    public void menu() {

        System.out.println("Main Menu:");
        System.out.println(" ---------------------");
        System.out.println("1. Status of Ingredients ");
        System.out.println("2. Fill Ingredient");
        System.out.println("3. Clean Machine");
        System.out.println("4. Make Coffee");
        System.out.println("5. How many Coffees have we made?");
        System.out.println("6. EXIT");
        System.out.println(" ---------------------");
        int menuChoiceInt = scanner.nextInt();
        switch (menuChoiceInt) {

            case 1:
                System.out.println("Status of ingredients: ");
                System.out.println("---------------------------");
                System.out.println("Available coffee: " + this.coffeePowder + "g");
                System.out.println("Available milk: " + this.milk + "L");
                System.out.println("Available water: " + this.water + "L");
                menu();
                break;
            case 2:
                System.out.println("Filling Machine...");
                fillIngredient();
                menu();
                break;
            case 3:
                System.out.println("Cleaning machine...");
                cleanMachine();
                menu();
                break;
            case 4:
                System.out.println("Making Coffee...");
                System.out.println("");
                System.out.println("Taking 20g of Coffee Powder");
                System.out.println("Taking 0.2l of water");
                System.out.println("Taking 0.2l of milk");
                aCoffe();
                menu();
                break;
            case 5:
                System.out.println("We have made: " + coffeeCount);
                menu();
                break;

        }
    }
}


