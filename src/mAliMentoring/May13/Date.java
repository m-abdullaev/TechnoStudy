package mAliMentoring.May13;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {
    public static void main(String[] args) {

        today();
    }

    public static void today() {
        LocalDate id = LocalDate.now();
        System.out.println(id);

        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("MM/dd/YYYY");

        String s1 = id.format(myFormatter);
        System.out.println(s1);

    }


}
