package com.exerciseJava;

/*
Write a program that will calculate and finally print the product of all numbers in the table below.
*/

public class Exercise10 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int multiply = 1;
        for (int i = 0; i < numbers.length; i++) {
            multiply = multiply * numbers[i];
        }
            System.out.println("Multiply of array elements is: " + multiply);
    }
}
