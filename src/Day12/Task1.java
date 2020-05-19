package Day12;

import java.util.Scanner;

public class Task1 {
    /*
Write a Java program to evaluate exam result of student
ex: 'A' -> Excellent!!!
 */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your score: ");
        int score = scanner.nextInt();


        if (score >= 90 && score <= 100) {
            System.out.println("Excellent");
        } else if (score >= 80 && score <= 90) {
            System.out.println("Good");
        } else if (score >= 70 && score <= 60) {
            System.out.println("It's okay");
        } else if (score >= 50 && score <= 40) {
            System.out.println("Bad :)");
        } else
            System.out.println("Fail");


    }
}

//    Scanner scan = new Scanner( System.in );
//
//        System.out.print( "Provide exam result of student[A, B, C, D, F]: " );
//                String examResult = scan.nextLine();
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
//                } else {
//                System.out.println( "Not valid input!!!" );
//                }
//public static void main(String[] args) {
//    //with scanner
//    Scanner scan = new Scanner( System.in );
//
//    //with random     01234
//    String results = "ABCDF#";
//    Random rand = new Random();
//    char letter = results.charAt( rand.nextInt( 6 ) );
//
//    System.out.print( "Provide exam result of student[A, B, C, D, F]: " );
//    String examResult = letter + ""; //String.valueOf(  ); Character.toString(  );
//    System.out.println(examResult);
//
//    if(examResult.equals( "A" )) {
//        System.out.println( "Excellent!!!" );
//    } else if(examResult.equals( "B" )) {
//        System.out.println( "Well done" );
//    } else if(examResult.equals( "C" )) {
//        System.out.println( "Good" );
//    } else if(examResult.equals( "D" )) {
//        System.out.println( "Need improvement" );
//    } else if(examResult.equals( "F" )) {
//        System.out.println( "Fail" );
//    } else {
//        System.out.println( "Not valid input!!!" );
//    }
//   /*
//    Write a Java program to evaluate exam result of student
//    ex:
//    'A'-> Excellent!!!
//    'B'-> Well done
//    'C'-> Good
//    'D'-> Need improvement
//    'F'-> Fail
//     */
//
//    public static void main(String[] args) {
//        //with scanner
////        Scanner scan = new Scanner( System.in );
////        System.out.print( "Provide exam result of student[A, B, C, D, F]: " );
////        String examResult = scan.nextLine();
//
//        //with random     01234
//        String results = "ABCDF#";
//        Random rand = new Random();
//        char letter = results.charAt( rand.nextInt( 6 ) );
//
//        System.out.print( "Provide exam result of student[A, B, C, D, F]: " );
//        String examResult = letter + ""; //String.valueOf(  ); Character.toString(  );
//        System.out.println( examResult );
//
//        if(examResult.equals( "A" )) {
//            System.out.println( "Excellent!!!" );
//        } else if(examResult.equals( "B" )) {
//            System.out.println( "Well done" );
//        } else if(examResult.equals( "C" )) {
//            System.out.println( "Good" );
//        } else if(examResult.equals( "D" )) {
//            System.out.println( "Need improvement" );
//        } else if(examResult.equals( "F" )) {
//            System.out.println( "Fail" );
//        } else {
//            System.out.println( "Not valid input!!!" );
//        }
//
//    }
//}