package com.practice;

public class EvenOddArray {
    public static void fromArray(){
        int[] arr = {12,43,2,6,43,8,9,6};

        for (int i : arr){
            if(i%2==0){
                System.out.println("even "+i);
            }
            else
                System.out.println("odd " +i);
        }
    }

    public static void main(String[] args) {
        fromArray();
    }
}
