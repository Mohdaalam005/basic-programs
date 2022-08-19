package com.practice;

public class SumOfArray {
    public static void sumOfArray(){
        int[] array = {12,12,12,12,12} ;
        int count = 0 ;

        for (int i =0 ; i < array.length ; i++){
            count = count + array[i] ;

        }
        System.out.println(count);
    }
    public static void usingSecondLoop(){
        int[] array = {12,12,12,12};

        int count = 0 ;
        for(int arrays :array ){
            count += arrays ;


        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        sumOfArray();
        usingSecondLoop();
    }

}
