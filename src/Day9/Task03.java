package Day9;

import java.util.Scanner;

public class Task03 {
    // Write a Java program to get a number from the user
    // and print whether it is positive or negative

    // ex: 10 -> positive
    // ex1: -5 -> negative

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int num = s.nextInt();

        if (num > 0) {
            System.out.println("Your number is positive");
        }

        if (num < 0) {
            System.out.println("Your number is negative");
        }

        if (num == 0) {
            System.out.println("Woahhh you've got zero");
        }


    }
}
