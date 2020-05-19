package Day16;

import java.util.Scanner;

public class Task05 {
    //create an array of vegetables with size 5
    //provide names of vegetable using scanner
    // print them in one line using for-each loop

    //ex: Enter vegetable name: Tomato
    //    Enter vegetable name: Potato

    // Vegetables: Tomato, Potato

    public static void main(String[] args) {
        int size = 5;
        String[] vegetables = new String[size];
        System.out.println("Please enter your vegetable: ");
        Scanner scanner = new Scanner(System.in);

        for (String vegetable : vegetables) {
            System.out.println(vegetable + ", ");
        }


    }
}
