package ShavkatMentoring;

import java.util.Scanner;

public class Task1 {

    /*
        Create one int

            if int is = 0
            print the i dont have any sibling

            if int is  = 1
            print the I have one sibling

            if int is = 2
            print the I have two sibling

            if int is more then 2
            print I have too many siblings

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int num = scan.nextInt();

        switch (num) {
            case 0:
                System.out.println("i dont have any sibling");
                break;
            case 1:
                System.out.println("I have one sibling");
                break;
            case 2:
                System.out.println("I have two sibling");
                break;
            default:
                System.out.println("I have too many siblings");


        }
    }
}
