package com.exerciseJava;

/*
Write a program that will display numbers from 0 to 100 on the console.
In the place when the number is divisible by 3, write your name.
In the place when the number is divides by 5, write your surname.
In the place when the number is divides by 3 and 5, write your name and surname.
*/

public class Exercise11 {
    public static void main(String[] args) {

        int i=0; {
            System.out.println(i);
        }

        for (int j=1; j<100; j++) {
            String text1 = "Katarzyna";
            String text2 = "Calka";
            String text3 = text1 + " " + text2;

            if ((j % 3) == 0 && (j % 5) == 0 ) {
                System.out.println(text3);
            }
            else if ((j % 3) == 0) {
                System.out.println(text1);
            }
            else if ((j % 5) == 0) {
                System.out.println(text2);
            }
            else {
                System.out.println(j);
            }
        }
    }
}
