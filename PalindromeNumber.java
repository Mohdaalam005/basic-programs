package com.practice;

import java.util.Scanner;

public class PalindromeNumber {
    
    public static void palindromeNUmber(int number){
        int temp = number ;
        int rem = 0 ;
        while (number!=0){
            rem = rem * 10 + number%10;
            number /=10 ;
        }
        if(temp == rem){
            System.out.println("Palindrome " + temp);
        }
        else
            System.out.println("not a Palindrome " + temp);
    }

    public static void palindromeString(String data){
        String org = data ;

        String  rev = "";
        for(int i = 0;i<data.length();i++){
            rev = data.charAt(i) + rev ;

        }
        System.out.println(rev);
        if(rev.equalsIgnoreCase(org))
            System.out.println("palinrome String "+org);
        else
            System.out.println("not a palindrome String " +org);
    }
    public static void main(String[] args) {
        palindromeNUmber(121);
        palindromeString("madam");



    }
    

}

