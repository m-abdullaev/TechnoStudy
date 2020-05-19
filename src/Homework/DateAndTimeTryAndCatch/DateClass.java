package Homework.DateAndTimeTryAndCatch;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateClass {
    public static String checkDates() {
        LocalDate today = LocalDate.now();
        String str = today.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        return str;
    }
}
