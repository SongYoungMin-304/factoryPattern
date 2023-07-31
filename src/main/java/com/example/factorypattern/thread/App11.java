package com.example.factorypattern.thread;

import java.util.TreeMap;
import java.util.concurrent.*;
import java.util.function.Supplier;

public class App11 {


    public static void main(String[] args) throws InterruptedException, ExecutionException {


        ExecutorService e = Executors.newFixedThreadPool(5);


        //String test = future.get().toUpperCase();

        Future<String> future = e.submit(getStringCallable());
        CompletableFuture<String> c = CompletableFuture.supplyAsync(getStringSupplier(),e).thenApply((s) -> s.toUpperCase());




        String s = c.get();




        Thread.sleep(10000000L);


    }

    private static Supplier<String> getStringSupplier() {
        return () -> {
            try {
                System.out.println("----"+Thread.currentThread().getName());
                Thread.sleep(3000L);
            } catch (Exception e1) {
                throw new RuntimeException(e1);
            }
            return "song";
        };
    }

    private static Callable<String> getStringCallable() {
        return () -> "test";
    }


}
