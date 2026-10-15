
package com.example;

public class EvenOdd {

    public String checkNumber(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        EvenOdd obj = new EvenOdd();
        int number = 7;

        System.out.println(number + " is " +
                           obj.checkNumber(number));
    }
}
