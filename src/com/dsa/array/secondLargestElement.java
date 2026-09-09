package com.dsa.array;

public class secondLargestElement {
    public static void main(String[] args){
        int arr[] = {10,90,100,80,70,60,30,20};
        int largestElement = arr[0];
        int secondLargestElement = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i]>largestElement){
                secondLargestElement = largestElement;
                largestElement = arr[i];
            }
            else if(arr[i]>secondLargestElement && arr[i] != largestElement){
                secondLargestElement = arr[i];
            }
        }
        System.out.println("Largest Element : "+largestElement);
        System.out.println("Second largest Element : "+secondLargestElement);
    }
}
