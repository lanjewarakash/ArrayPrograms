package com.blz.array;

public class LargestNumber {
    public static void main(String[] args) {
        int[] myArr = {10, 20, 30, 40, 50, 60, 80, 90, 100};

        LargestNumber obj = new LargestNumber();
        obj.checkLargeNum(myArr);
    }

    public void checkLargeNum(int[] myArr) {
        int largest = 0;
        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] > largest) {
                largest = myArr[i];
            }
        }
        System.out.println(largest);
    }
}
