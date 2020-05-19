package mAliMentoring;

import java.util.Scanner;

public class forPractice {
    /*
    Write a program to find the factorial value of any number entered through the scanner class.
    Example:
    number:7
    factorial:1234567=5040
    output should be == 5040
    number:6
    factorial:12345*6=720
    output should be == 720
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int useIntAsMax = scan.nextInt();
        int sum = 1;

        for (int i = 1; i <= useIntAsMax; i++) {
            sum = sum * i;
        }
        System.out.println(sum);

    }
}
