package com.practice;

public class Pattern {

    public static void pattern1(){
        for(int i = 1 ; i<=5 ;i++){
            for(int j = 1 ; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void pattern2(){
        for(int i = 1 ; i<=5 ;i++){
            for(int j = 1 ; j<=i ; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern1();
        System.out.println("---------------------------------------------");
        pattern2();

    }
}
