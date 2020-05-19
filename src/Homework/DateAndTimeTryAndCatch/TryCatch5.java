package Homework.DateAndTimeTryAndCatch;

public class TryCatch5 {
    /**
     * Create a method name is getChar()
     * Parameter is one string and one int
     * return type is String
     * Get the char in the position of num from the str1
     * if the String is null
     * return String can not be null
     * NOTE: Do not use if statement use try catch block
     */
    public static String getChar(String str, int num) {

        try {
            char character = str.charAt(num);
        } catch (NullPointerException ex) {
            return "String can not be null";
        }
        return String.valueOf(str.charAt(num));
    }
}
