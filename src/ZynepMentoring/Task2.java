package ZynepMentoring;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = scanner.nextInt();

        for (int i = 0; i <= 10; i++) {
            int result;
            result = num * i;
            System.out.println(num + " * " + i + " = " + result);

        }


    }
}
