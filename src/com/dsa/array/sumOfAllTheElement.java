package com.dsa.array;

public class sumOfAllTheElement {
    public static void main(String[] args){
        int arr[] = {10,90,9087,90};
        int sum = arr[0];
        for (int i = 0; i<arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum Of The Array: "+sum);
    }
}
