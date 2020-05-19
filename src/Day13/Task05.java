package Day13;

import java.util.Scanner;

public class Task05 {
    // write program which checks if provide hacking code is correct
    // use do-while
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to hacking tutorial!!!");
        String hacks;
        do {
            hacks = input.nextLine();
            System.out.println("Breaching the network...");
        } while (hacks.length() < 10);

        System.out.println("Hacking is over, police get you");

    }

}
//    public static void main(String[] args) {
//        Scanner input = new Scanner( System.in );
//
//        String hacks = input.nextLine();
//        while(hacks.length() < 10) {
//            System.out.println( "Breaching the network..." );
//            hacks = input.nextLine();
//        }
//
//        System.out.println( "Hacking is over, police get you" );
//