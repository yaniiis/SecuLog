package com.exemple;

public class Primenumber {
     public static boolean isPrime(int n){
        if(n == 0){
            return false;
        }
        if(n == 1){
            return true;
        }
        if(n == 2){
            return true;
        }
        if(n == 3){
            System.out.println("Fizz");
            return true;
        }
        if(n == 4){
            System.out.println("Buzz");
            return false;
        }
        return false;
     }
}
