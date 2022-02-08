package com.phyothinzaraung.algorithm;

import java.util.Arrays;

public class FindMinMax {
    public static void main(String[] args) {
        int[] arr = {13,5,6,8,3,1,9,2};
        int[] minMax = findMinMax(arr);
        System.out.println(Arrays.toString(minMax));
    }

    static int[] findMinMax(int[] array){
        int min = array[0];
        int max = array[0];

        for(int i=1; i<array.length; i++){
            if(array[i] < min){
                min = array[i];
            }else if(array[i]> max){
                max = array[i];
            }
        }
        return new int[] {min, max};
    }
}
