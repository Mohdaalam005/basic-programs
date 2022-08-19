package com.practice;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);

        int c = 0;


        for (int i = 2; i <= 10; i++) {

            c = a + b;

            a = b;
            b = c;
            System.out.println(c);
        }
    }
}
