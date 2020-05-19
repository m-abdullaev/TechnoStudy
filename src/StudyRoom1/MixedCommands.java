package StudyRoom1;

import java.util.Scanner;

public class MixedCommands {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your full name: ");
        String fullName = scan.nextLine();
        int f1 = fullName.indexOf('M');
        int f2 = fullName.indexOf('J');
        int f3 = f1 + 1;
        int f4 = f2 + 1;
        System.out.println(f1 + "," + f3);
        System.out.println(f2 + "," + f4);

        System.out.println("Initials is: " + fullName.substring(f1, f3)
                + ". " + fullName.substring(f2, f4) + ".");


    }
}
