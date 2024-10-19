package org.example;

public class Number {

    public static boolean isPrime(int num){
        if (num <= 1) {
            return false;
        }

        for (int i = 2;i < Math.sqrt(num);i++){
            if (num % i == 0){
                return false;
            }
        }

        return true;
    }

    public static boolean isEven(int num){
        return num % 2 == 0;
    }

    public static boolean isMultiple(int num, int divisor){
        return num % divisor == 0;
    }
}
