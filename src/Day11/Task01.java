package Day11;

import java.util.Random;

public class Task01 {

    public static void main(String[] args) {


//        int generated1 = rand.nextInt(5);
//        System.out.println("Random 0-5: " + generated1);

//        int generated2 = (int) (Math.random()*5)+5;
//
//        System.out.println("Random: 5-10: " + generated2);
        Random random = new Random();
        int low = 0;
        int high = 5;


        int zeroToFive = random.nextInt(high + 1);// 0,1,2,3,4,5

        System.out.println("0-5: " + zeroToFive);
        System.out.println("5-10: " + (zeroToFive + 5));


    }
}
