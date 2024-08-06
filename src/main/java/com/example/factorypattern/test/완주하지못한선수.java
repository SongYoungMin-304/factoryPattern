package com.example.factorypattern.test;

import java.util.HashMap;
import java.util.Map;

public class 완주하지못한선수 {

    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> partMap = new HashMap<>();

        Map<String, Integer> compMap = new HashMap<>();

        for (String s : participant) {
            if (partMap.containsKey(s)) {
                partMap.put(s, partMap.get(s) + 1);
            } else {
                partMap.put(s, 1);
            }
        }

        for (String c : completion) {
            partMap.put(c, partMap.get(c) - 1);
        }

        for (String key : partMap.keySet()) {
            if (partMap.get(key) != 0) {
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        완주하지못한선수 a = new 완주하지못한선수();
    }

}
