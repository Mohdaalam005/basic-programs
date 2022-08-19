package com.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SecondLargestNumber {
    public static void main(String[] args) {

        Integer[] arry = {12,43,12,62,6,2,64,6,23} ;

        List<Integer> integers = Arrays.asList(arry) ;
        System.out.println(integers.size()-1);

//        Integer number = integers.stream().min(Comparator.reverseOrder()).stream().skip(1).findFirst().get() ;
        Collections.sort(integers);
        Integer i =
        integers.get(integers.size()-1) ;
        System.out.println(i);

        // minimum
        Arrays.sort(arry);
        System.out.println(args[1]);
    }



}
