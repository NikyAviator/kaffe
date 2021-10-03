package com.company;

public class MakeCoffee {
    CoffeeMachine coffeeMachine = new CoffeeMachine();
//    FillIngredient fillIngredient = new FillIngredient();
//    public double makeWater = 0.2;
//    public double makeMilk = 0.2;
//    public double makeCoffeePowder = 20;

    public void aCoffe() {  //TODO

        coffeeMachine.setWater(coffeeMachine.getWater()-0.2);
        coffeeMachine.setMilk(coffeeMachine.getMilk()-0.2);
        coffeeMachine.setCoffeePowder(coffeeMachine.getCoffeePowder()-20);
        coffeeMachine.setCoffeeCount(coffeeMachine.getCoffeeCount());
        coffeeMachine.menu();
    }
}
