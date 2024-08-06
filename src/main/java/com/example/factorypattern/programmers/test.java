package com.example.factorypattern.programmers;

public class test {

    // 대출 가능한 현금 보유액은 매일 은행의 수입과 지출에 따라 변합니다.

    // 기존 현금 보유액에 + 수입 - 지출 - 대출액 < 0 현금이 부족한 상황


    public int solution(int[] income, int[] outlay, int cash) {
        int answer = cash;
        for(int a = 1; a <= cash; a++) {

            int tempCash = cash;

            for (int i = 0; i < income.length; i++) {

                tempCash += income[i];
                tempCash -= outlay[i];

                if(tempCash - (a * (i + 1)) < 0) {
                    return answer -1;
                }
                answer = a;

            }
        }

        return answer -1;
    }
    public static void main(String[] args) {
        test test = new test();
        int[] income = {10, 20, 0, 30, 70, 10};
        int[] outlay = {20, 25, 15, 5, 15, 10};
        int cash = 100;
        System.out.println("-----------");
        System.out.println(test.solution(income, outlay, cash));
    }
}
