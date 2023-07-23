package com.example.factorypattern.TemplateMethod.after;

public class ManualCarAfter extends Car{

    public void drive(){
        System.out.println("MANUAL DRIVE");
    }

    public void stop(){
        System.out.println("MANUAL STOP");
    }
}
