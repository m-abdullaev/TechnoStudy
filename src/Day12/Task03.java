package Day12;

import java.util.Scanner;

public class Task03 {
    /*
  // Write a Java program to input week day and print day number.

  "Monday" = > 1
  "Tuesday" => 2
   */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter day of the week: ");
        String input = scan.nextLine();
        input.toUpperCase();

        switch (input) {
            case "MONDAY":
                System.out.println(1);
                break;
            case "TUESDAY":
                System.out.println(2);
                break;
            case "WEDNESDAY":
                System.out.println(3);
                break;
            case "THURSDAY":
                System.out.println(4);
                break;
            case "FRIDAY":
                System.out.println(5);
                break;
            case "SATURDAY":
                System.out.println(6);
                break;
            case "SUNDAY":
                System.out.println(7);
                break;
            default:
                System.out.println("Not Valid day");
                break;


        }

    }


}
//    public static void main(String[] args) {
//        Scanner scan = new Scanner( System.in );
//
//        System.out.println( "Please enter day of the week: " );
//        String day = scan.nextLine();
//        day = day.toUpperCase();
//
//        String dayNumber = "";
//        switch(day) {
//            case "MONDAY":
//                dayNumber = "1";
//                break;
//            case "TUESDAY":
//                dayNumber = "2";
//                break;
//            case "WEDNESDAY":
//                dayNumber = "3";
//                break;
//            case "THURSDAY":
//                dayNumber = "4";
//                break;
//            case "FRIDAY":
//                dayNumber = "5";
//                break;
//            case "SATURDAY":
//                dayNumber = "6";
//                break;
//            case "SUNDAY":
//                dayNumber = "7";
//                break;
//            default:
//                dayNumber = "Not a valid week day";
//                break;
//        }
//
//        System.out.println( dayNumber );
