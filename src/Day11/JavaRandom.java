package Day11;

import java.util.Random;

public class JavaRandom {

    //    public static void main(String[] args) {
//
//        // Math.r1(); gives r1 number between 0.0 and 1.0
////        System.out.println( "\nr1: " + Math.r1() );
//
//        // how to get integer number from r1
//
//        double r1 = Math.random();
//        //to get number between 0 - 10
//        int r2 = (int) (r1 * 10);
//
//        System.out.println( "r1 double: " + r1 );
//        System.out.println( "r2 integer: " + r2 );
//
//
//        Random random = new Random();
//        int randomInt = random.nextInt( 3 );
//        System.out.println( "Random int: " + randomInt );
    public static void main(String[] args) {
        //1. way
        double random = Math.random() * 10; // 0 - 10
        int generated1 = (int) random;
        System.out.println("Math.random: " + generated1);

        //2. way
        Random rand = new Random();
        int generated2 = rand.nextInt(11);// 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        System.out.println("Random: " + generated2);
    }


}