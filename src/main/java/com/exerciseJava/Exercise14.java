package com.exerciseJava;
import java.util.Scanner;

/*
Write a program that asks the user for a password. If the user provides a valid password,
the console displays the message "The password is correct". If the user provides a wrong password,
the console displays the message "The password is incorrect". The correct password is "Java".
*/

public class Exercise14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the password:");
        String password = "Java";
        String word = input.next();

        if (word.equals(password)){
            System.out.println("The password is correct");
        }
        else{
            System.out.println("The password is incorrect");
        }
    }
}
