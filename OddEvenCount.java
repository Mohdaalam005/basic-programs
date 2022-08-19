package com.practice;

public class OddEvenCount {

    public static void addEvenNumber(int number){
        int div, odd=0,even = 0 ;
        while (number != 0){
            div = number % 10 ;
            if(div % 2== 0){
                even++ ;
            }
            else
                odd++ ;
            number /= 10 ;
        }
        System.out.println("Odd Number Is = "+ odd );
        System.out.println("Even Number is  ="+even);

    }
    public static void main(String[] args) {
        addEvenNumber(12345123);

    }
}
