package com.company;

public class FillIngredient {
    CoffeeMachine coffeeMachine = new CoffeeMachine();
    public double maxWater = 2.0;
    public double maxMilk = 2.0;
    public double maxCoffeePowder = 500.0;

    public void fillIngredient(){
        coffeeMachine.setWater(maxWater);
        coffeeMachine.setMilk(maxMilk);
        coffeeMachine.setCoffeePowder(maxCoffeePowder);
        coffeeMachine.menu();
    }
}
