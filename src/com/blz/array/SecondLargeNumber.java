package com.blz.array;

public class SecondLargeNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print(" Second Largest element in the array is : ");
        printElement(arr);

    }

    public static void printElement(int[] arr) {
        int largest = 0;
        for (int i = 0; i < arr.length; i++)
            if (largest < arr[i])
                largest = arr[i] - 1;
        System.out.println(largest);
    }
}
