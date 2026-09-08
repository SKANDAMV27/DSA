package com.dsa.array;

public class largestElement {
    public static void main(String[] args){
        int arr[] = {1009,9088,9866,2133,2781,90909};

        int largest = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i]<largest){
                largest = arr[i];
            }
        }
        System.out.println("Find The Largest Element: "+largest);
    }

}
