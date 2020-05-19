package Day12;


import java.util.Random;

public class Task3 {
    // write a program that prints word representation of your number
    //      where number is 0 <= N <= 5
    // ex: 0 => zero
    // ex: 3 => three

    public static void main(String[] args) {

        Random rand = new Random();
        int number = rand.nextInt(6);

        System.out.println("Your number " + number);
        switch (number) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Not Valid");

        }

    }


}
//    public static void main(String[] args) {
//        Random random = new Random();
//
//        int number = random.nextInt( 6 );
//        System.out.println( "number is " + number );
//
//        String numberRep = "";
//        switch(number) {
//            case 0:
//                numberRep = "zero";
//                //System.out.println( "zero" );
//                break;
//            case 1:
//                numberRep = "one";
//                break;
//            case 2:
//                numberRep = "two";
//                break;
//            case 3:
//                numberRep = "three";
//                break;
//        }
//
//        System.out.println( numberRep );
//    }
