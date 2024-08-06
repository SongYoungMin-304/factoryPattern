package com.example.factorypattern.programmers;

public class test4 {

    public int solution(int[] arr) {
        int answer = 0;

        if(checkPartitionArray(arr)) answer++;

        for(int a = 0; a < arr.length; a++){
            for(int b = a + 1; b < arr.length; b++){
                if(arr[a] != arr[b]) {
                    int temp = arr[a];
                    arr[a] = arr[b];
                    arr[b] = temp;
                    boolean check = checkPartitionArray(arr);
                    if (check) {
                        answer++;
                    }
                    temp = arr[a];
                    arr[a] = arr[b];
                    arr[b] = temp;
                }
            }
        }

        return answer;
    }

    public boolean checkPartitionArray(int[] arr){

        int sum = 0;

        for (int i : arr) {
            sum += i;
        }

        if(sum % 2 == 1){
            return false;
        }

        int temp = 0;
        int temp2 = 0;
        int target = sum / 2;


        int k = 0;

        for(int a = 0; a < arr.length; a++) {
            temp += arr[a];
            if(temp == target) {
                k = a;
                break;
            }
        }

        if(k == arr.length -1) {
            return false;
        }

        for(int b = k + 1 ; b < arr.length; b++) {
            temp2 += arr[b];
        }

        return temp2 == target;
    }



    public static void main(String[] args) {
        test4 test = new test4();
        int[] arr = {4,2,4,-3,-1};

        //int[] arr2 = {1,2,2,1};

        System.out.println("-----------");
        System.out.println(test.solution(arr));

        //System.out.println(test.checkPartitionArray(arr2));

    }

}
