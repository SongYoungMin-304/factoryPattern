package com.example.factorypattern.thread;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

public class App9 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<String> hello = CompletableFuture.supplyAsync(() -> {
            System.out.println("Hello " + Thread.currentThread().getName());
            return "Hello";
        });

        CompletableFuture<String> world = CompletableFuture.supplyAsync(() -> {
            System.out.println("World " + Thread.currentThread().getName());
            return "World";
        });

        CompletableFuture<String> future = hello.thenCompose(App9::getWorld);
        String s = future.get();
        System.out.println(s);


        CompletableFuture<String> future1 = hello.thenCombine(world, (h, w) -> h + " " + w);
        System.out.println(future1.get());

        // 여러 타입을 받기
        List<CompletableFuture<String>> futures = Arrays.asList(hello, world);

        CompletableFuture[] futuresArray = futures.toArray(new CompletableFuture[futures.size()]);

        CompletableFuture<List<String>> results = CompletableFuture.allOf(futuresArray).thenApply(v -> {
            return futures.stream()
                    .map(CompletableFuture::join)
                    .collect(Collectors.toList());
        });

        System.out.println("start");
        results.get().forEach(System.out::println);
        System.out.println("end");


        CompletableFuture<Void> future3 = CompletableFuture.anyOf(hello, world).thenAccept(System.out::println);
        future3.get();


        boolean throwError = true;

        CompletableFuture.supplyAsync(() -> {
            if(throwError){
                throw new IllegalArgumentException();
            }

            System.out.println("Hello " + Thread.currentThread().getName());
            return "Hello";
        }).handle((result, ex) -> {
            if(ex != null){
                System.out.println("test");
                return "Error";
            }
            return result;
        });


    }

    private static CompletableFuture<String> getWorld(String message) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("World" + Thread.currentThread().getName());
            return message + " World";
        });
    }
}
