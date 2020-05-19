package Day9;

import java.util.Scanner;

public class Task01 {
    // write a java program, where user provides prices of two items
    // and your program should calculate total price

    //input:
    // Enter price of item 1:
    // $10.9
    // Enter price of item 2:
    // $1.1

    //output:
    // Total: $12.0

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter price of item 1: ");
        String s1 = scan.nextLine();
        System.out.print("Enter price of item 2: ");
        String s2 = scan.nextLine();

        s1 = s1.replace("$", "");
        s2 = s2.replace("$", "");

        double total = Double.valueOf(s1) + Double.valueOf(s2);
        System.out.println("Total price is: " + total);

        // add tax


    }
}
