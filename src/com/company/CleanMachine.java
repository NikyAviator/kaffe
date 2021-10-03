package com.company;

public class CleanMachine {
    CoffeeMachine coffeeMachine = new CoffeeMachine();
    public double zeroWater = 0.0;
    public double zeroMilk = 0.0;
    public double zeroCoffeePowder = 0.0;

    public void emptyMachine(){
        coffeeMachine.setWater(zeroWater);
        coffeeMachine.setMilk(zeroMilk);
        coffeeMachine.setCoffeePowder(zeroCoffeePowder);
        coffeeMachine.menu();
    }
}
