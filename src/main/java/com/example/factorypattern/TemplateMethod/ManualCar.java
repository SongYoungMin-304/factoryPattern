package com.example.factorypattern.TemplateMethod;

public class ManualCar {
    public void startCar(){
        System.out.println("시동을 켭니다.");
    }

    public void turnoff(){
        System.out.println("시동을 끕니다.");
    }

    public void drive(){
        System.out.println("MANUAL DRIVE");
    }

    public void stop(){
        System.out.println("MANUAL STOP");
    }
}
