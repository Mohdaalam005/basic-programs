package com.practice;

public class LargestNumber {

    public static void largestOfThreeNUmber(int a,int b ,int c){

        if(a>b && a > c){
            System.out.println("Greater  "+a);
        }
        else if (b>a && b>c){
            System.out.println("Greater " + b);}
        else
            System.out.println("Greater Is " +c);
    }

    public static void largestOfThreeNumberUsingTernary(int a , int b, int c ){
        int largest = a>b?a : b ;
         largest = c > largest ? c : largest ;

        System.out.println(largest);
    }

    public static void largestNumberFromArray(){
        int[] arry = {12,43,23,6,2,34,32} ;
        int max = arry[0] ;

        for (int i =0 ; i < arry.length ; i++){
            if(arry[i] > max){
                max = arry[i] ;
            }
//            System.out.println(max);
        }
        System.out.println("max " +max);
    }
    public static void minFromArray(){
        int[] arry = {12,34,23,5,423,23};
        int min = arry[0];

        for (int i = 0 ; i < arry.length ; i++){
            if( arry[i] < min ){
                min = arry[i] ;
            }
        }
        System.out.println("min " +min);
    }

    public static void main(String[] args) {
        minFromArray();
        largestNumberFromArray();
        largestOfThreeNUmber(121,43,132);
        largestOfThreeNumberUsingTernary(12,13,14);

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