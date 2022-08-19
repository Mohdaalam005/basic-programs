package com.practice;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter The Year ");
        int year = scanner.nextInt();

        if((year % 400 == 0 || year % 4 == 0) && (year != 0) ){
            System.out.println(year +" is leap year");
        }
        else
            System.out.println(year + " is not a leap year ");
    }
}
