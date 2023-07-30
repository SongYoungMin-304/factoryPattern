package com.example.factorypattern.thread;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class App5 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Callable<String> hello = () -> {
            Thread.sleep(5000L);
            return "Hello1111";
        };

        Callable<String> hello2 = () -> {
            Thread.sleep(1000L);
            return "Hello2222";
        };

        Callable<String> hello3 = () -> {
            Thread.sleep(30000L);
            return "Hello3333";
        };


        /*

         */
        List<Future<String>> futures = executorService.invokeAll(Arrays.asList(hello, hello2, hello3));
        for (Future<String> future : futures) {
            System.out.println("futureCheck: " +future.get());
        }

        String s1 = executorService.invokeAny(Arrays.asList(hello, hello2, hello3));
        System.out.println("songsong: "+s1);


        Future<String> helloFuture = executorService.submit(hello);
        System.out.println(helloFuture.get());

        executorService.shutdown();

    }
}
