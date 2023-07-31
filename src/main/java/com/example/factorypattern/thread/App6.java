package com.example.factorypattern.thread;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class App6 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Callable<String> hello = () -> {
            Thread.sleep(3000L);
            System.out.println("step1" + Thread.currentThread().getName());
            return  "hello1";
        };

        Callable<String> hello2 = () -> {
            Thread.sleep(1000L);
            System.out.println("step2" + Thread.currentThread().getName());
            return  "hello2";
        };

        Callable<String> hello3 = () -> {
            Thread.sleep(5000L);
            System.out.println("step3" + Thread.currentThread().getName());
            return  "hello3";
        };

        String s = executorService.invokeAll(Arrays.asList(hello, hello2, hello3)).toString();

        System.out.println("finish");



    }

}
