package com.timbuchalka;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5); // the array myIntegers will contain VALUES array
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + " typed value was " + myIntegers[i]);
        }
    }

    public static int[] getIntegers(int number) { // declaring a method which will return an ARRAY using NUMBER
        System.out.println("Enter " + number + " integer values.\r"); // asking for input in the next line
        int[] values = new int[number]; // declaring the length of the TEMPORARY array, the length is based on NUMBER
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
}
