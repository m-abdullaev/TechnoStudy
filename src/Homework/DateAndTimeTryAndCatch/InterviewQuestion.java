package Homework.DateAndTimeTryAndCatch;

import java.util.ArrayList;

public class InterviewQuestion {
    public static ArrayList<String> myFancyPants(int low, int high,
                                                 int A, int B) {
        ArrayList<String> list = new ArrayList<>();

        for (int i = low; i < high; i++) {
            if (i % B == 0 && i % A == 0) {
                list.add("FancyPants");
            } else if (i % A == 0) {
                list.add("Fancy");
            } else if (i % B == 0) {
                list.add("Pants");
            } else {
                list.add(Integer.toString(i));
            }
        }
        return list;

    }
}
