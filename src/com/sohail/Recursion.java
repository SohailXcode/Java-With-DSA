package com.sohail;

public class Recursion {
    public static void main(String[] args) {

        int number = 5;
        int result = factorial(number);
        System.out.println("Factorial of " + 
                          number + " = " + result);
    }

    static int factorial(int n) {

        // BASE CASE - ruk jao!
        if(n == 1) {
            System.out.println("Base case reached! n=1");
            return 1;
        }

        // RECURSIVE CASE - chota karo!
        System.out.println("Calling factorial(" + (n-1) + ")");
        return n * factorial(n - 1);
    }
}
