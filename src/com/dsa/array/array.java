package com.dsa.array;

public class array {
    public static void main(String[] args){
        int arr[] = {100,908,20,909,290,810,390};

        int largest = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i]<largest){
                largest = arr[i];
            }
        }
        System.out.println("Largest Element : "+largest);
    }
}
