package Day8;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // 1. way
        System.out.println("1. way: " + (2 * 3 * 4 * 5));

        // 2. way
        int a = 2, b = 3, c = 4, d = 5;
        System.out.println("2. way: " + (a * b * c * d));

        // 3. way
        int result = 2; // 2
        result = result * 3; // 2 * 3 = 6
        result = result * 4; // 6 * 4 = 24
        result = result * 5; // 24 * 5 = 120
        System.out.println("3. way: " + result);

    }
}
