package com.example.factorypattern.Decorator;

public class Mocha extends Decorator{
    public Mocha(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void brewing(){
        super.brewing();
        System.out.println("Adding Mocha syrup");
    }
}
