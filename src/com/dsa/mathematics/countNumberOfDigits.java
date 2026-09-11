package com.dsa.mathematics;

import java.util.Scanner;

public class countNumberOfDigits {

    static long countDigits(long n){
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
