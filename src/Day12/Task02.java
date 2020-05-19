package Day12;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

                /*
    Write a Java program to evaluate exam result of student
    ex:
    'A'-> Excellent!!!
    'B'-> Well done
    'C'-> Good
    'D'-> Need improvement
    'F'-> Fail
     */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Grade: ");
        String input = scanner.next();

        if (input.equals("A")) {
            System.out.println("Excellent");
        } else if (input.equals("B")) {
            System.out.println("Well Done");
        } else if (input.equals("C")) {
            System.out.println("Good");
        } else if (input.equals("D")) {
            System.out.println("Need Improvement");
        } else if (input.equals("F")) {
            System.out.println("Fail");
        }
    }
}
//    String str = "ABCDF";
//    //01234
//    Random random = new Random();
//    int randomIndex = random.nextInt( 5 );
//
//    String examResult = "" + str.charAt( randomIndex );  //String.valueOf( str.charAt(randomIndex) ); //Character.toString(str.charAt(randomIndex));
//
//        System.out.println( "Exam result: " + examResult );
//
//                if(examResult.equals( "A" )) {
//                System.out.println( "Excellent!!!" );
//                } else if(examResult.equals( "B" )) {
//                System.out.println( "Well done" );
//                } else if(examResult.equals( "C" )) {
//                System.out.println( "Good" );
//                } else if(examResult.equals( "D" )) {
//                System.out.println( "Need improvement" );
//                } else if(examResult.equals( "F" )) {
//                System.out.println( "Fail" );
//                }
//        String examResult = scan.nextLine();

//        System.out.println( "Exam result: " + examResult );
//
//                String mark = "";
//                if(examResult.equals( "A" )) {
//                mark = "Excellent!!!";
//                } else if(examResult.equals( "B" )) {
//                mark = "Well done";
//                } else if(examResult.equals( "C" )) {
//                mark = "Good";
//                } else if(examResult.equals( "D" )) {
//                mark = "Need improvement";
//                } else if(examResult.equals( "F" )) {
//                mark = "Fail";
//                }
//
//                System.out.println( mark );
//  /*
//            'A'-> Excellent!!!
//            'B'-> Well done
//            'C'-> Good
//            'D'-> Need improvement
//            'F'-> Fail
//     */
//public static void main(String[] args) {
//    Scanner scan = new Scanner( System.in );
//    System.out.print( "Provide exam result of student[A, B, C, D, F]: " );
//    String examResult = scan.nextLine();
//
//    switch(examResult) {
//        case "A": // if(examResult.equals( "A" ))
//            System.out.println( "Excellent!!!" );
//            break;
//        case "B":// if(examResult.equals( "B" ))
//            System.out.println( "Well done" );
//            break;
//        case "C":// if(examResult.equals( "C" ))
//            System.out.println( "Good" );
//            break;
//        case "D":// if(examResult.equals( "D" ))
//            System.out.println( "Need improvement" );
//            break;
//        case "F":// if(examResult.equals( "F" ))
//            System.out.println( "Fail" );
//            break;
//    /*
//            'A'-> Excellent!!!
//            'B'-> Well done
//            'C'-> Good
//            'D'-> Need improvement
//            'F'-> Fail
//     */
//public static void main(String[] args) {
//    Scanner scan = new Scanner( System.in );
//    System.out.print( "Provide exam result of student[A, B, C, D, F]: " );
//    String examResult = scan.nextLine();
//
//    String examMark = "";
//    switch(examResult) {
//        case "A":
//            examMark = "Excellent!!!";
//            break;
//        case "B":
//            examMark = "Well done";
//            break;
//        case "C":
//            examMark = "Good";
//            break;
//        case "D":
//            examMark = "Need improvement";
//            break;
//        case "F":
//            examMark = "Fail";
//            break;
//        default:
//            examMark = "Not a valid input";
//            break;
//    }
//
//    System.out.println( examMark );
//
