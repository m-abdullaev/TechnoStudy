package Homework;

import java.util.Scanner;

public class CodingBat {
    /**
     * Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
     * The string length will be at least 2.
     * <p>
     * left2("Hello") → "lloHe"
     * left2("java") → "vaja"
     * left2("Hi") → "Hi"
     */
    public String withouEnd2(String str) {
        if (str.length() >= 2)
            return str.substring(1, str.length() - 1);
        else
            return str;
    }
}


