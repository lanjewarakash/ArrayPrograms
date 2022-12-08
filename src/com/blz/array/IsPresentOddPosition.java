package com.blz.array;

public class IsPresentOddPosition {
    public static void main(String[] args) {
        int[] myArr = {84, 11, 66, 66, 48, 98, 90, 65, 30, 30};
        System.out.println("The Array Elements In Odd Position : ");

        IsPresentOddPosition obj = new IsPresentOddPosition();
        obj.checkOddNum(myArr);
    }

    public void checkOddNum(int[] myArr) {
        for (int i = 0; i < myArr.length; i = i + 2) {
            System.out.print(myArr[i] + " ");
        }
    }
}

