package Day5;

import java.util.Scanner;

public class scanner1 {

    // string -> Texts
    // byte -> whole numbers
    // short -> whole numbers
    // int -> whole numbers
    // boolean -> true, false
    // double -> decimal numbers
    // float -> decimal numbers
    // long -> decimal numbers
    // char -> character

    /*
    Scanner:
       Scanner is a class for getting the input of the primitive types like int, boolean and also String.. It is the
       easiest way to read input in the java programming
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        System.out.println("your username is " + username);

        String lastName = scanner.nextLine();

        System.out.println("your last name is " + lastName);

    }

}
