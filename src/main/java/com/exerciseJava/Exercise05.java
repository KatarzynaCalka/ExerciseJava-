package com.exerciseJava;
import java.util.Scanner;

/*
Write a program that displays the message "Enter a positive number".
After the user enter the total positive number, program will display
a number from the number entered by the user to 0.
*/

public class Exercise05 {
    public static void main(String[] args) {

        int i;
        Scanner input = new Scanner(System.in);

		    System.out.println("Enter a posivite number:");
            i = Integer.parseInt(input.nextLine());

		    for (; i >= 0; i--) {
                System.out.println(i);
            }
    }
}
