package com.example.factorypattern.programmers;



import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class test3 {

    class coffeeOrder{
        int orderNo;
        int remainTime;
    }

    public int[] solution(int N, int[] coffee_times){
        int i = 0;

        int[] answer = new int[coffee_times.length];

        Queue<coffeeOrder> readyCoffeeOrder = new LinkedList<coffeeOrder>();
        Queue<coffeeOrder> workingCoffeeOrder = new LinkedList<coffeeOrder>();

        for(int a = 0; a < coffee_times.length; a++) {
            coffeeOrder order = new coffeeOrder();
            order.orderNo = a + 1;
            order.remainTime = coffee_times[a];
            readyCoffeeOrder.add(order);
        }

        while(workingCoffeeOrder.size() > 0 || readyCoffeeOrder.size() > 0) {

            // 일단 비어있으면 넣잦
            while (workingCoffeeOrder.size() < N && readyCoffeeOrder.size() > 0) {
                workingCoffeeOrder.add(readyCoffeeOrder.poll());
            }

            // 다 넣었으면 1초가 지나자
            for (coffeeOrder coffee : workingCoffeeOrder) {
                coffee.remainTime--;
            }

            // 완료된 주문 확인
            for (coffeeOrder coffee : workingCoffeeOrder) {
                if (coffee.remainTime == 0) {
                    answer[i++] = coffee.orderNo;
                }
            }

            // 0초 남은거 제거
            workingCoffeeOrder.removeIf(coffee -> coffee.remainTime == 0);
        }

        return answer;
    }

    public static void main(String[] args) throws InterruptedException {
        test3 test = new test3();
        int N = 3;
        int[] coffee_times = {4, 2, 2, 5, 3};
        System.out.println("-----------");

        int[] array = test.solution(N, coffee_times);

        for(int a = 0; a < array.length; a++) {
            System.out.println(array[a]);
        }

    }

}
