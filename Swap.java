package com.practice;

public class Swap {

    public void swapOfTwoValue(int  num1 , int num2){
        int number = num1 ;
        int number1 = num2 ;
        int temp = num1 ;
        number = number1;
        number1 = temp ;
        System.out.println(number);
        System.out.println(number1);
    }
    public void swapWithoutThirdVariable(int num1 ,int num2){
        num1 = num1 + num2 ; // 11 =  5 + 6
        num2 = num1 - num2 ; //   5 =  11 - 6
        num1 = num1 - num2 ;  // 6 = 11 - 5
        System.out.println(num1);
        System.out.println(num2);

    }

    public static void swapUsingDivision(int num1 , int num2){
        num1 = num1*num2 ;
        num2 = num1 / num2 ;
        num1 = num1 / num2 ;
        System.out.println(num1);
        System.out.println(num2);
    }
    public static void swapUsingXor(int num1 , int num2){
        num1 = num1 ^ num2 ;
        num2 = num1 ^ num2 ;
        num1 = num1 ^ num2 ;
        System.out.println("using xor " +num1);
        System.out.println(num2);
    }
    public static void swapUsingSingleStatement(int a, int b){
        b = a+b -(a=b) ;
        System.out.println("swapping"+a);
        System.out.println("swapping"+b);
    }



    public static void main(String[] args) {

        Swap swap = new Swap();
        swap.swapOfTwoValue(12,21);
        swap.swapWithoutThirdVariable(5,6);
        swapUsingDivision(10,20);
        swapUsingXor(10,20);
        swapUsingSingleStatement(10,20);

    }
}
