package Day5;

import java.util.Scanner;

public class scanner4 {

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        // create one int and enter monthly spent print number
        System.out.println("Enter your monthly spent");
        int monthlySpent = s1.nextInt();
        System.out.println("your monthly spent is " + monthlySpent);

        // String, int
        // double

        System.out.println("Enter monthly spent in decimal ");
        double monthlySpentDouble = s1.nextDouble();
        System.out.println("your monthly spent in decimal " + monthlySpentDouble);

        // create one double and which is salary and print that salary

        System.out.println("Enter your salary");
        double salary = s1.nextDouble();
        System.out.println("Your Salary is " + salary);


    }
}
