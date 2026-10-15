
package com.example;

public class Addition {

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Addition obj = new Addition();

        int a = 10;
        int b = 20;

        System.out.println("Sum = " + obj.add(a, b));
    }
}

