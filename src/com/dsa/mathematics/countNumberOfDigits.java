package com.dsa.mathematics;

import java.util.Scanner;

public class countNumberOfDigits {

    static long countDigits(long n){

        if(n==0){
            return 1; //if n==0 then writer 1
        }
        n = Math.abs(n); // this is for negative value
        long count = 0;

        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(countDigits(n));
    }
}
