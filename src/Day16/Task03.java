package Day16;

import java.util.Random;

public class Task03 {
    // create an array with size 10
    // populate your array with random numbers using Random or Math.random()
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int randomNum = random.nextInt(20);
            array[i] = randomNum;

//            sum += array[i];
            System.out.println(array[i]);

        }
    }
}
