package com.example.factorypattern.state;

public class App {

    public static void main(String[] args) {
        Player p1 = new Player();

        p1.play(1);

        p1.upgradeLevel(new AdvancedLevel());

        p1.play(1);

        p1.upgradeLevel(new SuperLevel());

        p1.play(1);

    }

}
