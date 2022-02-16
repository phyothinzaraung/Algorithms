package com.phyothinzaraung.algorithm;

public class PatternExercise {

    public static void main(String[] args) {
        starPyramid(10);
    }

    static void starPyramid(int n){
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
