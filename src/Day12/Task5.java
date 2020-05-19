package Day12;

import java.util.Scanner;

public class Task5 {

    // Write a Java program that takes a year from user
    // and print whether that year is a leap year or not.
    // year % 4 == 0 = true -> year %100 => true next
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the year: ");
        int input = scanner.nextInt();

        if (input % 4 == 0) ;

    }
}
//    public static void main(String[] args) {
//
//        Scanner in = new Scanner( System.in );
//
//        System.out.print( "Input the year: " );
//        int year = in.nextInt();
//
//        boolean x = (year % 4) == 0;
//        boolean y = (year % 100) != 0;
//        boolean z = ((year % 100 == 0) && (year % 400 == 0));
//
//        if(x && (y || z)) {
//            System.out.println( year + " is a leap year" );
//        } else {
//            System.out.println( year + " is not a leap year" );
//        }
//    }


//    public static void main(String[] args) {
//
//        int year;    // holds a year
//
//        // Create a Scanner object for keyboard input.
//        Scanner in = new Scanner( System.in );
//
//        // Get the year.
//        System.out.print( "Enter a year : " );
//        year = in.nextInt();
//
//        // Determine whether the year is leap year.
//        if(year % 4 == 0) {
//            if(year % 100 == 0) {
//                if(year % 400 == 0) {
//                    System.out.println( "A leap year" );
//                } else {
//                    System.out.println( "Not a leap year" );
//                }
//            } else {
//                System.out.println( "A leap year" );
//            }
//        } else {
//            System.out.println( "Not a leap year" );
//        }