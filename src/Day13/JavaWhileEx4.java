package Day13;

import java.util.Scanner;

public class JavaWhileEx4 {
    // write program which checks if provide hacking code is correct
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Write hacking code");
        int hackCode = input.nextInt();

        while (hackCode == 9999) {
            System.out.println("reaching secret data");
            hackCode = input.nextInt();
        }


    }

}
// write program which checks if provide hacking code is correct

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
