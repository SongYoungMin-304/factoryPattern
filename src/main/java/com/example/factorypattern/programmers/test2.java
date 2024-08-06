package com.example.factorypattern.programmers;

public class test2 {

    public int solution(int[] income, int[] outlay, int cash) {

        int 대출금 = cash + income[0] - outlay[0];

        for(int b = 대출금; b > 0; b--) {

            int tempCash = cash;

            for(int a = 0; a < income.length; a++) {
                tempCash += income[a];
                tempCash -= outlay[a];
                tempCash -= b;
                if(tempCash <= 0) {
                    break;
                }

                if(a == income.length - 1) {
                    return b;
                }
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        test2 test = new test2();
        int[] income = {1, 2, 4, 8, 16, 32, 64, 128};
        int[] outlay = {10, 10, 10, 10, 10, 10, 10, 10};
        int cash = 9;
        System.out.println("-----------");
        System.out.println(test.solution(income, outlay, cash));
    }
}
