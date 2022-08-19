package com.practice;

public class ReverseString {

    public static void reverseStringUsingLogic(String data){
        String rev = "";

        for (int i = 0 ; i< data.length() ;i++){
            rev =  data.charAt(i) + rev ;

        }
        System.out.println(rev);
    }
    public static void reverseStringUsingBuilder(String data){
        StringBuilder stringBuilder = new StringBuilder(data) ;
        StringBuilder rev = stringBuilder.reverse();
        System.out.println(rev);
    }
    

    public static void main(String[] args) {
        reverseStringUsingBuilder("alma");

        reverseStringUsingLogic("Aalam");

    }
}
