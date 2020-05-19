package Day10;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many rooms do you need? ");
        int n = scan.nextInt();

        if (n > 3) {
            System.out.println("Sorry we don't have more than 3 rooms");

        } else if (n == 3) {
            System.out.println("rent is 2500");
        } else if (n == 2) {
            System.out.println("rent is 2000");
        } else if (n == 1) {
            System.out.println("rent is 1500");
        } else if (n == 0) {
            System.out.println("rent is 1300");
        }
        //            THIS ONE IS ALSO OTHER TO SOLVE THE QUESTION
//        int rent = 0;
//        if(roomCount>3){
//            System.out.println("we don't have any apartments more then 3 rooms");
//
//        }else if(roomCount == 3){
//            rent = 2500;
//
//        }else if(roomCount == 2){
//            rent = 2000;
//
//        }else if(roomCount == 1){
//            rent = 1500;
//
//        }else if(roomCount == 0){
//            rent = 1300;
//        }
//
//        System.out.println("Your rent will be " + rent );

    }
}
