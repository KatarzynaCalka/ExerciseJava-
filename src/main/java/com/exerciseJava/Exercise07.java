package com.exerciseJava;
import java.util.Scanner;

/*
Write a program that prints the message "Enter your age" and retrieves its age from the user,
When the age is above 16 it will display the message "You can watch this movie".
When the age is below 16 it will display the message "You are too young".
*/

public class Exercise07 {
    public static void main(String[] args) {

        int age;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        age = Integer.parseInt(input.nextLine());

        if (age >= 16) {
            System.out.println("You can watch this movie.");
        }

        else {
            System.out.println("You are too young.");
        }

    }
}
