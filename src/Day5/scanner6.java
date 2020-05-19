package Day5;

import java.util.Scanner;

public class scanner6 {

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);

        // byte -128 127 nextByte
        System.out.println("how many tickets you want ");
        byte totalTicketCount = s1.nextByte();
        System.out.println("answer for ticket count " + totalTicketCount);

        // short nextShort

        System.out.println("Total amount for the tickets");
        short ticketTotal = s1.nextShort();
        System.out.println("Total count of your tickets " + ticketTotal);

        // float
        System.out.println("Single ticket price ");
        float f1 = s1.nextFloat();
        System.out.println("Single amount of your ticket" + f1);

        /*
           Scanner class
           We are able to type in the console
                we can also print it

            String --> nextLine()
            int    --> nextInt()
            boolean --> nextBoolean()
            byte   --> nextByte()
            short  --> nextShort()
            float  --> nextFloat()
          */


    }
}
