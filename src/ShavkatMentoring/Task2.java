package ShavkatMentoring;

import java.util.Scanner;

public class Task2 {

//    Create a scanner object
//
//    Create a string , Assing string to scanner
//
//
//        if String is US
//    print I live in United States
//        if String is BEL
//    print I live in Belgium
//        if String is DEU
//    print I live in Germany
//            else
//    print I live somewhere else

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your country: ");
        String input = scan.nextLine();

        switch (input.toUpperCase()) {
            case "US":
                System.out.println("I live in United States");
                break;
            case ("BEL"):
                System.out.println("I live in Belgium ");
                break;
            case ("DEU"):
                System.out.println("I live in Germany");
                break;
            default:
                System.out.println("I live somewhere else");


        }


    }
}
