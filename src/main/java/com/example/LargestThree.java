
package com.example;

public class LargestThree {

    public int findLargest(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        LargestThree obj = new LargestThree();

        System.out.println(
            "Largest number: " + obj.findLargest(10, 25, 15)
        );
    }
}
