package com.practice;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 152 , res = 0 ,temp = num  ;
        int rem ;

        while(num!=0){
            rem = num % 10 ;
            res = res + (rem * rem * rem) ;
            num /= 10 ;
        }
        if(temp==res){
            System.out.println("armstrong is "+temp);
        }
        else
            System.out.println(temp +" is not armstrong " );
    }
}
