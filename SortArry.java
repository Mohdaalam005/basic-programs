package com.practice;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class SortArry {
    public static void main(String[] args) {
        // creating array
        int[] array = {1, 3, 4, 2, 7, 6, 5,9,10,8,12,11};
        // sorting the array
        Arrays.sort(array);

        // printing sorted array using toString 
        System.out.println(Arrays.toString(array));

    }
}
