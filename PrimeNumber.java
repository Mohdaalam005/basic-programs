package com.practice;

public class PrimeNumber {

    public static void primeNumber(int num){
        int count = 0 ;
        if(num > 1){
            for (int i = 1 ; i <= num ;i++){
                if(num % i == 0){
                    count++ ;
                }
            }
            if(count == 2){
                System.out.println("prime number " + count);
            }
            else
                System.out.println("not prime number" + count);
        }
    }

    public static void main(String[] args) {

        
        primeNumber(13);
        int num = 15 ;
        int count = 0 ;
        for(int i = 2 ; i<num / 2;++i){
            if(num % i == 0 ){
                count++ ;
                break;
            }

        }
        if(count == 0){
            System.out.println(num+" is a prime number");
        }
        else
            System.out.println(num + " not a prime number ");
    }
}


