package com.practice;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter The Number : " );

        int number = s.nextInt(), rem, result = 0, temp = number;

        while(number != 0){
            rem = number % 10 ;
            result = (result * 10 ) + rem ;
            number /= 10;
        }
        if(temp == result){
            System.out.println("palindrome number " + temp);
        }

        else
            System.out.println(temp + " is not palindrome number");

    }

}

