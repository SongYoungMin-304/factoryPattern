package com.example.factorypattern.thread;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.concurrent.*;
import java.util.function.Supplier;

public class App10 {

    public static void main(String[] args) throws Exception {


        System.out.println(LocalDateTime.now());
        /*CompletableFuture c = CompletableFuture.supplyAsync(getSupplier1());
        CompletableFuture c2 = CompletableFuture.supplyAsync(getSupplier2());
        CompletableFuture c3 = CompletableFuture.supplyAsync(getSupplier2());
        */

        ExecutorService e = Executors.newFixedThreadPool(3);

        Callable<String> hello = () -> {
            Thread.sleep(5000L);
            System.out.println("step1" + Thread.currentThread().getName());
            return  "hello1";
        };

        Callable<String> hello2 = () -> {
            Thread.sleep(5000L);
            System.out.println("step2" + Thread.currentThread().getName());
            return  "hello2";
        };

        Callable<String> hello3 = () -> {
            Thread.sleep(3000L);
            System.out.println("step3" + Thread.currentThread().getName());
            return  "hello3";
        };

        Future<String> submit = e.submit(hello);
        Future<String> submit1 = e.submit(hello2);


        submit1.get();
        Future<String> submit2 = e.submit(hello3);
        submit2.get();

        System.out.println(LocalDateTime.now());

    }

    private static Runnable getRunnable3() {
        return () -> {
            try {
                step3();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
    }

    private static Runnable getRunnable2() {
        return () -> {
            try {
                step2();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
    }

    private static Runnable getRunnable() {
        return () -> {
            try {
                step1();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
    }

    private static Callable<String> getCallable() throws InterruptedException {
        step1();
        System.out.println("step1" + Thread.currentThread().getName());
        return () -> "test222";
    }

    private static Callable<String> getCallable2() throws InterruptedException {
        step2();
        System.out.println("step2" + Thread.currentThread().getName());
        return () -> "test222";
    }

    private static Callable<String> getCallable3() throws InterruptedException {
        step3();
        System.out.println("step3" + Thread.currentThread().getName());
        return () -> "test222";
    }

    private static Supplier<String> getSupplier1() throws InterruptedException {
        step1();
        return () -> "test";
    }

    private static Supplier<String> getSupplier2() throws InterruptedException {
        step2();
        return () -> "test";
    }

    private static Supplier<String> getSupplier3() throws InterruptedException {
        step3();
        return () -> "test";
    }

    static void step1() throws InterruptedException {
        Thread.sleep(3000L);
    }
    static void step2() throws InterruptedException {
        Thread.sleep(3000L);
    }
    static void step3() throws InterruptedException {
        Thread.sleep(3000L);
    }
}
