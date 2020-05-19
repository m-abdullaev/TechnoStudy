package Day13;

import java.util.Scanner;

public class Task01 {

    // Ask user to provide a number;
    // calculate sum from 0 to provided number
    // ex: provided number: 2
    //     0+1+2 => 3
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Provide a number, please:");

        int lastNumber = input.nextInt();

        int result = 0;
        int i = 0;

        while (i <= lastNumber) {
            result += i;

            i++;
        }

        System.out.println("sum is: " + result);

    }

}
