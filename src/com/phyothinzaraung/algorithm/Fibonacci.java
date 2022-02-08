package com.phyothinzaraung.algorithm;

public class Fibonacci {

    public static void main(String[] args) {
        int number = 9;
        int result = fibonacci(number);
        System.out.println(result);
    }

    static int fibonacci(int inputNumber){
        if(inputNumber <= 1)
            return inputNumber;

        return fibonacci(inputNumber-1) + fibonacci(inputNumber-2);
    }
}
