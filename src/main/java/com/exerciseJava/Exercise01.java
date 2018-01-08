package com.exerciseJava;
import java.util.Scanner;

/*
Write a program where the user will enter the number of the day of the week (numbers from 1 to 7)
and get the answer which is the day of the week. For example when the user will enter the number "3"
to display the message "Wednesday". As the user will indicate the day number outside the 1-7 range,
the program is to write a comment "There is no day of the week".
*/

public class Exercise01 {

    public static void main(String[] args) {

        String numberDays;
        System.out.println("Enter the number of the day of the week:");
        Scanner input = new Scanner(System.in);
        numberDays = input.nextLine();

        switch(numberDays) {
            case ("1"):
                System.out.println("Monday");
                break;
            case ("2"):
                System.out.println("Tuesday");
                break;
            case ("3"):
                System.out.println("Wednesday");
                break;
            case ("4"):
                System.out.println("Thursday");
                break;
            case ("5"):
                System.out.println("Friday");
                break;
            case ("6"):
                System.out.println("Saturday");
                break;
            case ("7"):
                System.out.println("Sunday");
                break;
            default:
                System.out.println("There is no day of the week");
        }
    }
}
