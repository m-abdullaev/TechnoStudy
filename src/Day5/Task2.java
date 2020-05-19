package Day5;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner sum = new Scanner(System.in);

        System.out.println("Please tell me total price of two items: ");


        System.out.println("Price1");
        int total = sum.nextInt();

        System.out.println("Price2");
        int price = sum.nextInt();

        System.out.println(total + price);
        System.out.println("Total is " + (total + price));


    }
}
