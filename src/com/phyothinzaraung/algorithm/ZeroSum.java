package com.phyothinzaraung.algorithm;

public class ZeroSum {

    public static void main(String[] args) {
        int[] nums = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
        String result = zeroSum(nums);
        System.out.println(result);
    }

    static String zeroSum(int[] inputArr){
        int sum = 0;
        for (int i=0; i<inputArr.length; i++){
            for(int j=i; j< inputArr.length; j++){
                sum += inputArr[j];
                if(sum == 0){
                    return "[" + i + "..." + j + "]";
                }
            }
        }
        return "";
    }
}
