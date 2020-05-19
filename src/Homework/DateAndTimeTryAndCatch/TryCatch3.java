package Homework.DateAndTimeTryAndCatch;

import java.util.ArrayList;

public class TryCatch3 {
    /**
     * Create a method sum()
     * parameter is one ArrayList Integer
     * return type is int
     * sum all the numbers in the Arraylist and return the total.
     * If there is a null in the arraylist return -1
     * NOTE : Do not use if statement use try catch block
     */
    public static int sum(ArrayList<Integer> list) {
        int total = 0;

        try {
            for (Integer integer : list) {
                total += integer;
            }

        } catch (NullPointerException ex) {
            return -1;
        }
        return total;
    }

}

