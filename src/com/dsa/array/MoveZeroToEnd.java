package com.dsa.array;

import java.util.Arrays;


public class MoveZeroToEnd {

    static void moveZeroToTheEnd(int[] arr){

        int index = 0; // declare the index value
        for(int i = 0; i<arr.length; i++){
            if(arr[i]!= 0){
                arr[index] = arr[i];
                index++;
            }
        }
        while (index<arr.length){
            arr[index] = 0;
            index++;
        }
    }

    public static void main(String[] args){
        int arr[] = {10,90,0,0,1,3,4,5,6,7,8,9,10,0,1,0};
        moveZeroToTheEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
}

//Time: O(n)
//Space: O(1)