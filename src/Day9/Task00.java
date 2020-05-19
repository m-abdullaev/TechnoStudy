package Day9;

import java.util.Scanner;

public class Task00 {

    public static void main(String[] args) {


        // using scanner provide a number
        // and check if its greater than 100
        //ex1
        // input: 99
        // output: 99 > 100: false

        //ex2
        // input: 200
        // output: 200 > 100: true
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide a number: ");
        int num = scan.nextInt();
        System.out.println(num + " > 100 " + (num > 100));


    }

}
