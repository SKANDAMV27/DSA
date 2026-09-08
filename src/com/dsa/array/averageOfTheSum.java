package com.dsa.array;

public class averageOfTheSum {
    public static void main(String[] args){
        int arr[] = {10,20,40,50,80,20,20,10};

        int sum = 0;

        for(int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];
        }

            double average = (double) sum / arr.length;

            System.out.println("Sum Of Element In The List: "+sum);
            System.out.println("Average :"+average);
        }


}
