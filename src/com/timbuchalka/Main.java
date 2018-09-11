package com.timbuchalka;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        String[] slownik = {"A", "B", "C", "D", "E", "F", "G"};
//        System.out.println(slownik[3]);
//        char[] tablicaZnakow = {'s', 'd', 'e', 'g', 'a', 'i'};
//        double[] ;


//        int[] myIntegers = getIntegers(5); // the array myIntegers will contain VALUES array
//        for (int i = 0; i < myIntegers.length; i++) {
//            System.out.println("Element " + i + " typed value was " + myIntegers[i]);
//        }
//*******************CHALLENGE*******************
        getIntegers(5) =



    }

    public static double getAverage(int number) {
        System.out.println("Enter " + number + " integer values.\r"); // asking for input in the next line
        int[] values = new int[number]; // declaring the length of the TEMPORARY array, the length is based on NUMBER
        double sum = 0;
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
            sum += values[i];
        }
        System.out.println(sum / values.length);
        return sum / values.length;
    }

    public static double getAverageTimsCode(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }

    public static int[] sortDescending(int[] array){

    }



    public static int[] getIntegers(int number) { // declaring a method which will return an ARRAY using NUMBER
        System.out.println("Enter " + number + " integer values.\r"); // asking for input in the next line
        int[] values = new int[number]; // declaring the length of the TEMPORARY array, the length is based on NUMBER
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values; // [1,2,3,4,5,6,7,8,9,10]
    }
}
