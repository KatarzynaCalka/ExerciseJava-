package com.exerciseJava;

/*
List all elements from the table "seasons" in the order in which they are located.
Write each element in a new line.
*/

public class Exercise08 {
    public static void main(String[] args) {

        String[] seasons = {"Spring", "Summer", "Autumn", "Winter" };
        // first method
        System.out.println(seasons[0]);
        System.out.println(seasons[1]);
        System.out.println(seasons[2]);
        System.out.println(seasons[3]);
        System.out.println("");

        // second method
        for (int i = 0; i < seasons.length; i++) {
            System.out.println(seasons[i]);
        }
    }
}
