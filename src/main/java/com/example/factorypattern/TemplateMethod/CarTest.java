package com.example.factorypattern.TemplateMethod;


import com.example.factorypattern.TemplateMethod.after.AICarAfter;
import com.example.factorypattern.TemplateMethod.after.Car;
import com.example.factorypattern.TemplateMethod.after.HybridCarAfter;
import com.example.factorypattern.TemplateMethod.after.ManualCarAfter;

public class CarTest {

    public static void main(String[] args) {

        AICar myCar = new AICar();
        myCar.startCar();
        myCar.drive();
        myCar.stop();
        myCar.turnoff();

        System.out.println("**************************");

        ManualCar herCar = new ManualCar();
        herCar.startCar();
        herCar.drive();
        herCar.stop();
        herCar.turnoff();

        System.out.println("**************************");

        HybridCar yourCar = new HybridCar();
        yourCar.startCar();
        yourCar.drive();
        yourCar.stop();
        yourCar.turnoff();

        System.out.println("**************************");


        AICarAfter myCar2 = new AICarAfter();

        ManualCarAfter herCar2 = new ManualCarAfter();

        HybridCarAfter yourCar2 = new HybridCarAfter();

        myCar2.run();

        herCar2.run();

        yourCar2.run();

    }
}
