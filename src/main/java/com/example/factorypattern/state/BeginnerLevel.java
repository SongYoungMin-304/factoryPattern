package com.example.factorypattern.state;

public class BeginnerLevel extends PlayerLevel{

    @Override
    public void run() {
        System.out.println("run level 1");
    }

    @Override
    public void jump() {
        System.out.println("jump level 1");
    }

    @Override
    public void turn() {
        System.out.println("turn level 1");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("Beginner 입니다.");
    }
}
