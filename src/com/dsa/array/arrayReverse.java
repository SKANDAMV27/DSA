package com.dsa.array;

import java.util.Arrays;

public class arrayReverse {

    static void array(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args){
        int arr[] = {10,9,8,7,6,5,4,3,2,1,};
        array(arr);
        System.out.println(Arrays.toString(arr));
    }
}
