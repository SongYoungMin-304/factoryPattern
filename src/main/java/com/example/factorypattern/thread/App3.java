package com.example.factorypattern.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App3 {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // submit 수행한 이후에도 종료하지 않음
        executorService.submit(getRunnable("no1"));
        executorService.submit(getRunnable("no2"));
        executorService.submit(getRunnable("no3"));
        executorService.submit(getRunnable("no4"));
        executorService.submit(getRunnable("no5"));

        executorService.shutdown();

        // 바로 종료
        //executorService.shutdownNow();
    }

    private static Runnable getRunnable(String message) {
        return () -> {
            System.out.println(message + Thread.currentThread().getName());
        };
    }

}
