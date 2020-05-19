package Homework.DateAndTimeTryAndCatch;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateClass3 {
    public static String previous(int howManyDays) {
        LocalDateTime today = LocalDateTime.now();
        LocalDateTime previousDate = today.minusDays(howManyDays);

        String str = previousDate.format(DateTimeFormatter.ofPattern("M/d/y"));
        return str;

    }

    public static void main(String[] args) {
        System.out.println(previous(6));
    }
}
