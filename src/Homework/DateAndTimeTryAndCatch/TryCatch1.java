package Homework.DateAndTimeTryAndCatch;

public class TryCatch1 {
    /**
     * Create a method name is nullPointer()
     * Parameter is String array and , one int  number
     * return type is String
     * if the int number is less then length of the array return the String
     * if the number is more than array length then return  "Invalid number!!!"
     * Note: Do not use if statement use try catch block
     */
    public static String nullPointer(String[] arr, int number) {
        try {
            String str = arr[number];

        } catch (ArrayIndexOutOfBoundsException ex) {
            return "Invalid Number";
        }
        return arr[number];
    }

    public static void main(String[] args) {

//        System.out.println(nullPointer({5},14));
    }
}
