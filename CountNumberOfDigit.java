package com.practice;

public class CountNumberOfDigit {
    public static void countDigit(int number){
        int count = 0;   //12345
        while (number !=0){
            number /=10 ;
            count++ ;

        }
        System.out.println(count);
    }


    public static void main(String[] args) {
        countDigit(1234567);
    }
}
