package com.practice;

public class Count {
    public static void countSumOfNumber(int number){
        int count = 0 ;
        while (number !=0){
            int rem = number % 10 ;
            count += rem ;

            number /=10 ;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        countSumOfNumber(12345);
    }
}
