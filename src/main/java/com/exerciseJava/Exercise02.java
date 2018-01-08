package com.exerciseJava;

/*
Write a program that will display all even numbers in the range <0, 100>.
Each number is displayed from the new line.
*/

public class Exercise02 {
    public static void main(String[] args) {

        int i=0;
        while(i < 101){
            if(i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}
