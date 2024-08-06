package com.example.여기어때.기술질문;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Tech {


    // 1. 람다식이란
    // 익명함수, 메소드를 하나의 식으로 표현한 것
    // 병렬 처리 이벤트 처리 등 함수적 프로그래밍에서 유용하게 쓰인다.

    // 함수형 인터페이스 -> 추상메소드가 단 하나인 인터페이스


    // 2. Stream API 란



    @FunctionalInterface
    public interface MyFunctionalInterface {
        public void method();
    }

    @FunctionalInterface
    public interface MyFunctionalInterface2 {
        public String method2(String msg);
    }




    public void main(String[] args) {

        MyFunctionalInterface myFunctionalInterface = () -> System.out.println("람다식");

        myFunctionalInterface.method();

        MyFunctionalInterface2 myFunctionalInterface2 = (msg) -> {
            return msg;
        };

        String s = myFunctionalInterface2.method2("람다식2");
        System.out.println(s);


        Function f = (a) -> {
            return a;
        };

        System.out.println(f.apply("람다식3"));

        Consumer c = (a) -> {
            System.out.println(a);
        };

        c.accept("람다식4");


        Supplier<String> s2 = () -> {
            return "람다식5";
        };

        System.out.println(s2.get());


        // Stream api
        String [] nameArr = {"a", "e", "b", "c", "d"};
        List<String> nameList = Arrays.asList(nameArr);

        String name = "a";

        song song = new song();
        song.name = "a";

        Stream<String> stringStream = nameList.stream().filter(s6 -> {
            System.out.println("testttttt");
            song.name = "b";
            return s6.startsWith(name);
        });

        stringStream.forEach(System.out::println);


        // 원본의 데이터를 변경하지 않는다.
        // : Stream Api는 원본의 데이터를 조회하여 원본의 데이터가 아닌 별도의 요소들로 Stream을 생선한다.

        // 일회용이다.
        // : Stream은 일회용이다. 한번 사용하고 나면 다시 사용할 수 없다.

        // 내부 반복으로 작업을 처리한다.
        // : Stream은 내부 반복을 통해 작업을 처리한다. 내부 반복이란 반복문을 사용하지 않고도 컬렉션의 모든 요소를 반복할 수 있는 기능을 말한다.







    }
    public class song {
        String name;
        int age;
    }
}
