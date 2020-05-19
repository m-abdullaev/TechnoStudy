package YusufMentoring;

import java.util.Arrays;

public class Task2DArray {
    //Task 1
    // {{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}}
    // create a 2D array and print how many values are even or odd.
    public static void main(String[] args) {
        int even = 0, odd = 0;
        int array[][] = {{7, 12, 97, 23}, {543, 23, 675}, {2}, {2, 33, 6, 3, 7}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }
        System.out.println("There are " + even + " even numbers and " + odd + " odd numbers. ");
        System.out.println(array[0][0]);
    }

}


