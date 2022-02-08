package com.phyothinzaraung.algorithm;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int[] arr = {2,4,5,6,8,9};
        int target = 10;
        int[] result = twoSums(arr, target);
        System.out.println(Arrays.toString(result));
    }

    static int[] twoSums(int[] arr, int target){
        for(int i = 0; i< arr.length; i++){
            for(int j = i+1; i<arr.length; i++){
                if(arr[i] + arr[j] == target)
                    return new int[] {arr[i], arr[j]};
            }
        }
        return new int[]{};
    }
}
