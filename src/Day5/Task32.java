package Day5;

import java.util.Scanner;

public class Task32 {

    public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));


        System.out.println("First number: ");
        int a = scan.nextInt();

        System.out.println("Second number: ");
        int b = scan.nextInt();

        int sum = a / b;
        System.out.println("Sum is " + sum);

    }
}
