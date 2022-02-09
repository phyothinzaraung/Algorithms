package com.phyothinzaraung.algorithm;

public class FindDuplicate {

    public static void main(String[] args) {
        int[] nums = {1,2,4,4,4,5,3};
        System.out.println(findDuplicate(nums));
    }

     static int findDuplicate(int[] arr){
        boolean visited[] = new boolean[arr.length+1];

        for(int value: arr){
            if(visited[value]){
                return value;
            }

            visited[value] = true;
        }

        //Not Found
        return -1;
     }
}
