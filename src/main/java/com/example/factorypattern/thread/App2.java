package com.example.factorypattern.thread;

public class App2 {


    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(3000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        System.out.println("start");

        thread.start();
        thread.join();

        System.out.println("end");


    }

}
