package mAliMentoring;

import java.util.Scanner;

public class Task4 {
    //Task 4
    //Tell the student his/her letter grade by asking them their number grade.
    //90 and above A
    //80 and above B
    //70 and above C
    //60 and above D
    //below 60 F
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is ur grade number?: ");
        int grade = input.nextInt();

        if (grade >= 90) {
            System.out.println("Grade A");
        } else if (grade >= 80) {
            System.out.println("Grade B");
        } else if (grade >= 70) {
            System.out.println("Grade C");
        } else if (grade >= 60) {
            System.out.println("Grade D");
        } else if (grade < 60) {
            System.out.println("Grade F");
        }
    }
}

