package Homework.DateAndTimeTryAndCatch;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateClass2 {

    /**
     * 1- Create a method name as future
     * Parameter is: int(howManyDays)
     * Return type is String
     * 2- Return the howManyDays ahead is the future date from today.
     * For Example:
     * howManyDays equal to 4
     * Today is 5/10/2020
     * return should be 5/14/2020
     * For Example:
     * howManyDays equal to 6
     * Today is 5/10/2020
     * return should be 5/16/2020
     */
    public static String future(int howManyDays) {
        LocalDate today = LocalDate.now();
        LocalDate futureDate = today.plusDays(howManyDays);

        String str = futureDate.format(DateTimeFormatter.ofPattern("MM/dd/yyy"));
        return str;
    }

    public static void main(String[] args) {

        System.out.println(future(5));
    }
}
