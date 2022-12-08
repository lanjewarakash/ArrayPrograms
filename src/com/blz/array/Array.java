package com.blz.array;

public class Array {
    public static void main(String[] args) {
        int[] myArr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        Array obj = new Array();
        obj.printArray(myArr);
    }

    public void printArray(int[] myArr) {
        System.out.print("{ ");
        for (int i = 0; i < myArr.length; i++) {
            System.out.print(myArr[i] + " ");
        }
        System.out.print("}");

    }
}
