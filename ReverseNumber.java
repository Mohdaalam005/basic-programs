package com.practice;

import java.util.Scanner;

public class ReverseNumber {
    public static void reverseNumber1(int number){
        int rev = 0 ;
        while (number!=0){
            rev = rev *10 + number % 10 ;
            number /= 10 ;
        }
        System.out.println(rev);
    }
    public static void reverseUsingInbuilt(int number)
    {
        StringBuffer rev ;
        StringBuffer stringBuffer = new StringBuffer(String.valueOf(number)) ;
        rev =  stringBuffer.reverse();
        System.out.println(rev);
    }
    public static void reverseUsingStringBuilder(int number){

        StringBuilder stringBuilder = new StringBuilder(String.valueOf(number)) ;
        StringBuilder rev = stringBuilder.reverse() ;
        System.out.println(rev);

    }

    public static void main(String[] args) {

        reverseNumber1(1234);
        reverseUsingInbuilt(4321);
        reverseUsingStringBuilder(54321);
    }
}
