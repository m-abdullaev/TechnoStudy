package Day11;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Cost price: ");
        int cost = scan.nextInt();
        System.out.println("Selling price: ");
        int selling = scan.nextInt();

        int total = selling - cost;
        if (total > 0) {
            System.out.println("Profit: $" + total);
        } else {
            System.out.println("Loss: $" + (total)); // it will give negative, so lets turn it to positive
            System.out.println("Loss: $" + Math.abs(total));
            System.out.println("Loss: $" + (-total));
        }


    }
}
