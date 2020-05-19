package Day7;

import java.lang.reflect.Array;
import java.util.Arrays;


public class StringSplit {

    public static void main(String[] args) {

        /*
        split()
        Splits a string into an array of substrings
        String[]
         */

//        String text = "SOFTWARE DEVELOPER in TEST";
//
//        System.out.println( Arrays.toString(text.split( " " )) );
        String text = "Good evening everybody";
        System.out.println("original: " + text);
        System.out.println("after split with ' ':" + Arrays.toString(text.split(" ")));

        text = "Good @ evening @ everybody";
        System.out.println("original: " + text);
        System.out.println("after split with ' ':" + Arrays.toString(text.split("@")));

    }
}
