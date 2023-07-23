package com.example.factorypattern.TemplateMethod;

public class HybridCar {
    public void startCar(){
        System.out.println("시동을 켭니다.");
    }

    public void turnoff(){
        System.out.println("시동을 끕니다.");
    }

    public void drive(){
        System.out.println("HYBRID DRIVE");
    }

    public void stop(){
        System.out.println("HYBRID STOP");
    }
}
