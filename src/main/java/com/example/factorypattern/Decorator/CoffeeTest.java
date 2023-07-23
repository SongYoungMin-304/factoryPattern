package com.example.factorypattern.Decorator;

public class CoffeeTest {

    public static void main(String[] args) {

        Coffee etiopiaAmericano = new EtiopiaAmercano();
        etiopiaAmericano.brewing();

        System.out.println("--------------");

        Coffee etiopiaLatte = new Latte(new EtiopiaAmercano());
        etiopiaLatte.brewing();

        System.out.println("--------------");

        Coffee etiopiaMochaLatte = new Mocha(new Latte(new EtiopiaAmercano()));
        etiopiaMochaLatte.brewing();
    }

}
