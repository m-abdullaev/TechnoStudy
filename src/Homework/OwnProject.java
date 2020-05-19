package Homework;

import java.util.Scanner;

public class OwnProject {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("What is your full name? ");


        String a = s.nextLine();
        System.out.println("My full name is " + a);

        System.out.println("What is your initials? ");
        String b = s.nextLine();
        String c = s.nextLine();
        System.out.println("It is " + b + "." + c + ".");


    }

}
