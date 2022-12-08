package com.blz.array;

public class AscendingArray {
    public static void main(String[] args) {

        int arr[] = { 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1 };
        AscendingArray obj = new AscendingArray();
        obj.sortArray(arr);
        obj.printArray(arr);
    }

    public void sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }
            }
        }
    }

    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
