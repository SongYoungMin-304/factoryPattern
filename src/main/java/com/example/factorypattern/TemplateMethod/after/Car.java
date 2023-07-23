package com.example.factorypattern.TemplateMethod.after;

public abstract class Car {

    final public void run(){
        startCar();
        drive();
        stop();
        turnoff();
        washCar();
    }

    public abstract void drive();
    public abstract void stop();

    public void washCar(){

    }

    public void startCar(){
        System.out.println("시동을 켭니다.");
    }

    public void turnoff(){
        System.out.println("시동을 끕니다.");
    }
}
