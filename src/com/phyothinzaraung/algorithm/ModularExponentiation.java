package com.phyothinzaraung.algorithm;

public class ModularExponentiation {
    public static void main(String[] args) {
        int result = calculateExponential(2, 5, 3);
        System.out.println(result);
    }

    static int calculateExponential(int x, int y, int p){
        int result = 1;
        if(x==0){
            return 0;
        }else {
            while (y>0){
                result *= x;
                y--;
            }
        }

        result = result % p;
        return result;
    }
}
