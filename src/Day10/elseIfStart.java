package Day10;

import java.util.Scanner;

public class elseIfStart {

    public static void main(String[] args) {

        Scanner dp = new Scanner(System.in);
        System.out.println("Enter name1");
        String name1 = dp.nextLine();

        System.out.println("Enter name2");
        String name2 = dp.nextLine();

        int total = name1.length() + name2.length();


        if (total > 15) {

            System.out.println("Your string is too long");

        } else if (total > 10) {

            System.out.println("Your string is okay");

        } else if (total > 5) {

            System.out.println("Your string is too short ");

        } else if (total > 0) {
            System.out.println("");
        }

        // NOTE you can have else if statement as much as you want


//              JAVA WILL PRINT ALL THE CONDITIONS BECAUSE OF ALL OF THEM ARE TRUE
//        if(total>15){
//
//            System.out.println("Your string is too long");
//
//        }
//
//        if(total > 10 ){
//
//            System.out.println("Your string is okay");
//
//        }
//
//        if(total >  5 ){
//
//            System.out.println("Your string is too short ");
    }
}
