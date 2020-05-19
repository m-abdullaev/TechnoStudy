package Homework.DateAndTimeTryAndCatch;

public class TryCatch4 {
    /**
     * Create method name is getCharacter()
     * Parameter is one String str1 and one int num
     * Return type is String
     * Get the char in the position of num from the str1
     * if the num is bigger then str1 length then return Invalid number!!!
     * NOTE: Do not use if statement use try catch block
     */
    public static String getCharacter(String str1, int num) {
        try {
            char character = str1.charAt(num);
        } catch (StringIndexOutOfBoundsException ex) {
            return "Invalid number!!!";
        }
        return String.valueOf(str1.charAt(num));
    }
}
