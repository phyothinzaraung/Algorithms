package com.phyothinzaraung.algorithm;

import java.util.Arrays;

public class ReversedInt {

    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5};
        reverse(nums, nums.length);
    }

    static void reverse(int a[], int n)
    {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }

        // printing the reversed array
        System.out.println("Reversed array is: \n");
        for (int k = 0; k < n; k++) {
            System.out.println(b[k]);
        }
    }
}
