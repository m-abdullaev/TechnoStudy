package YusufMentoring;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task32DArray {
    //Create a 2D String array
    //put the following values
    //                  {"techno","study"},
    //                {"atlanta","new jersey"},
    //                {"ohio","brooklyn"},
    //                {"pittsburgh"}
    //find the average length of the strings
    public static void main(String[] args) {
        String array[][] = {
                {"techno", "study"},
                {"atlanta", "new jersey"},
                {"ohio", "brooklyn"},
                {"pittsburgh"}
        };
        int sum = 0, count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j].length();
                count++;
            }
        }
        System.out.println("The average length of the strings is: " + (sum / count));

    }
}


