package com.company;

import java.util.Scanner;

public class CoffeeMachine<menuChoiceInt> {


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


    public int getCoffeeCount() {
        return coffeeCount;
    }

    public void setCoffeeCount(int coffeeCount) {
        this.coffeeCount = coffeeCount;
    }

    public double getWater() {
        return water;
    }

    public void setWater(double water) {
        this.water = water;
    }

    public double getMilk() {
        return milk;
    }

    public void setMilk(double milk) {
        this.milk = milk;
    }


    public double getCoffeePowder() {
        return coffeePowder;
    }


    public void setCoffeePowder(double coffeePowder) {
        this.coffeePowder = coffeePowder; //TODO kolla plustecknet
    }

    public void start() {
        System.out.println("Want to Start Machine - Y or N?");
        String menuChoiceString = scanner.next();
        switch (menuChoiceString) {
            case "Y":
                System.out.println("COFFEE MACHINE");
                menu();
                break;
            case "N":
                System.out.println("Closing the Coffee Machine!");
                break;
        }
    }


    public void menu() {

        System.out.println("Main Menu:");
//        System.out.println("Available coffee: " + getCoffeePowder());
//        System.out.println("Available milk: " + getMilk());
//        System.out.println("Available water: " + getWater());
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
                System.out.println("Available coffee: " + getCoffeePowder() + "g");
                System.out.println("Available milk: " + getMilk() + "L");
                System.out.println("Available water: " + getWater() + "L");
                menu();
                break;
            case 2:
                System.out.println("Filling Machine...");
                FillIngredient fillIngredient = new FillIngredient();
                fillIngredient.fillIngredient();
                break;
            case 3:
                System.out.println("Cleaning machine...");
                CleanMachine cleanMachine = new CleanMachine();
                cleanMachine.emptyMachine();
                break;
            case 4:
                System.out.println("Making Coffee...");
                System.out.println("");
                System.out.println("Taking 20g of Coffee Powder");
                System.out.println("Taking 0.2l of water");
                System.out.println("Taking 0.2l of milk");
                MakeCoffee makeCoffee = new MakeCoffee();
                makeCoffee.aCoffe();
        }
    }

}
