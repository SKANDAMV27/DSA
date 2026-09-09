package com.dsa.array;

public class evenOrOdd {
    public static void main(String[] args){
        int arr[] = {90,7,9,10,28,497,534};
        int even = 0;
        int odd = 0;
        for (int i = 0;i<arr.length; i++){
            if(arr[i]%2 == 0){
                even++;
            }
            odd++;
        }
        System.out.println("Even Count : "+even);
        System.out.println("Odd Count : "+odd);
    }
}
