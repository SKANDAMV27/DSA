package com.dsa.array;

public class secondSmallestElement {
    public static void main(String[] args){
        int arr[] = {100,90,1,98,95};
        int smallest = arr[0];
        int secondSmallest = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i]<secondSmallest && arr[i] != smallest){
                secondSmallest = arr[i];
            }
        }
        System.out.println("Smallest Element : "+smallest);
        System.out.println("Second Smallest Element : "+secondSmallest);
    }
}
