package com.dsa.array;

public class smallestElement {
    public static void main(String[] args){
        int arr[] = {10,90,80,20,80,70};
        int smallest = arr[0];
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i]<smallest){
                arr[i] = smallest;
            }
        }
        System.out.println("Find The Smallest Number: "+smallest);
    }
}
