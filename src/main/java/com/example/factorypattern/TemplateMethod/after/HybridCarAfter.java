package com.example.factorypattern.TemplateMethod.after;

public class HybridCarAfter extends Car{

    public void drive(){
        System.out.println("HYBRID DRIVE");
    }

    public void stop(){
        System.out.println("HYBRID STOP");
    }
}
