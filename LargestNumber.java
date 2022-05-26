package com.practice;

public class LargestNumber {

    public static void main(String[] args) {

        int[] arry = {122,43,56,34,32,67} ;

        int largerst = arry[0] ;
        int minimum = arry[0] ;

        for(int i = 1 ; i<= arry.length-1;i++){
            if ( largerst < arry[i]){
                largerst = arry[i];
            }
        }
        System.out.println(largerst);

        for (int i = 0; i < arry.length; i++) {
            if(minimum > arry[i]){
                minimum = arry[i] ;
            }

        }
        System.out.println(minimum);
    }

}