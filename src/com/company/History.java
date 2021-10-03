package com.company;

import java.util.ArrayList;

public class History {
    CoffeeMachine coffeeMachine = new CoffeeMachine();
    static ArrayList<String> history = new ArrayList<>();

     public void setHistory(){
        System.out.println("History of Coffee:");
        for (int i = 0; i < history.size(); i++) {
            System.out.println(coffeeMachine.getCoffeeCount());
        }
    }
}
