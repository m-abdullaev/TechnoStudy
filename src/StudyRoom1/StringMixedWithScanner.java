package StudyRoom1;

import java.util.Scanner;

public class StringMixedWithScanner {

    public static void main(String[] args) {
        System.out.println("What is your First name? ");
        Scanner a = new Scanner(System.in);
        String b = a.nextLine();
        System.out.println("My first name is: " + b);
        int first = b.length();
        System.out.println("The length of first name is: " + first);
        System.out.println("What is your Last Name? ");
        String c = a.nextLine();
        System.out.println("My Last Name is: " + c);
        int last = c.length();
        int sum = first + last;
        System.out.println("The length of last name is: " + last);

        System.out.println("The total length of your full name is: " + sum);

    }
}
