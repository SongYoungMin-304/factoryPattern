package com.example.factorypattern.test;

import java.util.HashMap;
import java.util.Map;

public class 의상 {

    public int solution(String [][] clothes){
        int answer = 1;

        Map map = new HashMap();

        for (String[] clothe : clothes) {
            if (map.containsKey(clothe[1])) {
                map.put(clothe[1], (int) map.get(clothe[1]) + 1);
            } else {
                map.put(clothe[1], 1);
            }
        }

        for(Object key : map.keySet()){

            System.out.println(key + " : " + map.get(key));

            answer *= (int)map.get(key) + 1;
        }

        return answer - 1;
    }

    public static void main(String[] args) {

        String [][] msg = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        의상 a = new 의상();

        int solution = a.solution(msg);

        System.out.println(solution);
    }

}
