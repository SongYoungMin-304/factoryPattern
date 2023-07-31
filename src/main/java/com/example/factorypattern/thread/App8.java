package com.example.factorypattern.thread;

import java.lang.reflect.Executable;
import java.util.concurrent.*;

public class App8 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("d");

                System.out.println("d22");
                String s ="kk";
                System.out.println(s);


                Thread.sleep(10000L);
                System.out.println("deee");

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "hello";
        }).thenApply((s) -> {
            return s.toUpperCase();
        });

        // completable future 는 callback을 미리 정의 할 수 있다..
        // thenAccept
        // thenRun

        //System.out.println(future.get());

        System.out.println("start");
        String s = future.get();
        System.out.println("end");
    }

}
