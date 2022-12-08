package com.blz.array;

public class ReverseArray {
    public static void main(String[] args) {
        int[] myArr = {123, 321, 345, 675, 789};
        System.out.println("Reverse Array Elements Are");

        ReverseArray obj = new ReverseArray();
        obj.printReverseArray(myArr);
    }

    public void printReverseArray(int[] myArr) {
        for (int i = myArr.length - 1; i >= 0; i--) {
            System.out.print(myArr[i] + " ");
        }

    }
}