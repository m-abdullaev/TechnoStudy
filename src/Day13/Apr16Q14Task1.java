package Day13;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Apr16Q14Task1 {
    //    Q14:Write a method called max that accepts an array of integers as a parameter
//    and returns the maximum value in the array.
//    For example, if the array passed stores {12, 7, -1, 25, 3, 9},
//    your method should return 25. You may assume that the array contains at least one element.
//    Your method should not modify the elements of the array.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter length for your Array: ");
        int len = scan.nextInt();
        int[] array = randomArray(len);
        System.out.println("Your Random Array is: " + Arrays.toString(array));
        System.out.println("Your max Value is: " + maxValue(array));
    }

    public static int maxValue(int[] arr) {
        int a = Integer.MIN_VALUE; // created min value to compare each element of Array from where it starts.
        for (int i = 0; i < arr.length; i++) {
            if (a < arr[i]) {
                a = arr[i];
            }
        }
        return a;
    }

    public static int[] randomArray(int length) {
        Random random = new Random();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }
        return array;
    }
}
