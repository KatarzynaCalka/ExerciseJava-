package com.exerciseJava;

/*
Using the looping statement, list all elements of the table "numbers".
Write each element in a new line.
*/

public class Exercise09 {
    public static void main(String[] args) {

        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
