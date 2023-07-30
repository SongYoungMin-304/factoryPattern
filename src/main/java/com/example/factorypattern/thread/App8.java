package com.example.factorypattern.thread;

import java.lang.reflect.Executable;
import java.util.concurrent.*;

public class App8 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("hello " + Thread.currentThread().getName());
            return "hello";
        }).thenApply((s) -> {
            return s.toUpperCase();
        });

        // completable future 는 callback을 미리 정의 할 수 있다..
        // thenAccept
        // thenRun

        //System.out.println(future.get());

        future.get();

        Thread.sleep(10000L);

        System.out.println("end");
    }

}
