package com.example.factorypattern.TemplateMethod.after;

public class AICarAfter extends Car{

    public void drive(){
        System.out.println("AI DRIVE");
    }

    public void stop(){
        System.out.println("AI STOP");
    }

    public void washCar(){
        System.out.println("자동으로 세차가 됩니다.");
    }
}
