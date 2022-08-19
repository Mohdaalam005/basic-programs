package com.practice;

public class PerfectNumber {
    public static void main(String[] args) {
        int number = 29 ,sum = 0 ;

        for (int i =1 ; i< number; i++) {
            if (number % i == 0) {
                sum+= i ;

            }
        }
        if(sum==number){
            System.out.println("perfect");
        }
        else
            System.out.println("not Perfect");

    }
}
