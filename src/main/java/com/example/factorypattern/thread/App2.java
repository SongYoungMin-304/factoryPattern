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

        thread.start();
        System.out.println("step1");

        thread.join();
        System.out.println("step2");


    }

}
