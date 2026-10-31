
package com.dsa.mathematics;

public class ReverseTheNumber {

    public static void main(String[] args) {
        int num = 2781;
        int original = num;
        int reversed = 0;

        while (num != 0) {
            int digits = num % 10;
            reversed = reversed * 10 + digits;
            num = num / 10;
        }

        System.out.println("Before Reverse: " + original);
        System.out.println("After Reverse: " + reversed);
    }
}
