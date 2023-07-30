package com.example.factorypattern.thread;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class App6 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Callable<String> hello = () -> {
            Thread.sleep(3000L);
            return  "hello1";
        };

        Callable<String> hello2 = () -> {
            Thread.sleep(1000L);
            return  "hello2";
        };

        Callable<String> hello3 = () -> {
            Thread.sleep(5000L);
            return  "hello3";
        };

        String s = executorService.invokeAny(Arrays.asList(hello, hello2, hello3));

        System.out.println(s);



    }

}
