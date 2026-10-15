
package com.example;

public class Factorial {

    public int findFactorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String[] args) {
        Factorial obj = new Factorial();
        System.out.println("Factorial: " + obj.findFactorial(5));
    }
}
