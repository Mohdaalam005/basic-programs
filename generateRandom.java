package com.practice;

import java.util.Random;
import java.util.stream.IntStream;

public class generateRandom {
    public static void generateUsingNumber(){
        Random random = new Random() ;
//        Object random_number = random.ints(0000,9999) ;
       int  random_number = random.nextInt(10);
        System.out.println(random_number);

    }

    public static void main(String[] args) {
        generateUsingNumber();
    }
}
