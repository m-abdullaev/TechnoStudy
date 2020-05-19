package Homework.DateAndTimeTryAndCatch;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateClass4 {
    public static void main(String[] args) {
//        checkAge("04/01/1988");
        System.out.println(checkAge("04/01/1988"));
    }

    public static int checkAge(String dob) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy"); //
        LocalDate dateOfBirth = LocalDate.parse(dob, formatter); //
        LocalDate today = LocalDate.now();    // to get local date

        Period actual = Period.between(dateOfBirth, today); // to get period
        return actual.getYears();
    }
}
