package com.blz.array;


public class IsPresentEvenPosition {
    public static void main(String[] args) {

        int[] myArr = {84, 11, 66, 66, 48, 98, 90, 65, 30, 30};
        System.out.println("The Array Elements In Even Position");

        IsPresentEvenPosition obj = new IsPresentEvenPosition();
        obj.checkEvenNum(myArr);
    }

    public void checkEvenNum(int[] myArr) {
        for (int i = 1; i < myArr.length; i = i + 2) {
            System.out.print (myArr[i] + " ");
        }
    }
}
