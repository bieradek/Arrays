package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
//        int[] myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] myIntArray = new int[25];
        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = i * 10;
        }
        for (int i = 0; i < myIntArray.length; i++) {
            System.out.println("Element " + i + " value is " + myIntArray[i]);
        }
        System.out.println(myIntArray[0]);
        System.out.println(myIntArray[1]);
        System.out.println(myIntArray[2]);
        System.out.println(myIntArray[3]);
        System.out.println(myIntArray[4]);

    }
}
