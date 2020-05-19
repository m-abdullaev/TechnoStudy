package Homework;


public class scanner1 {


    public static void main(String[] args) {
        String a = "Write a Java";

        boolean reverse;

    }


    public String reverseWord(String str) {
        String returnStr = "";
        String array[] = str.split(" ");
        for (int i = array.length - 1; i >= 0; i--) {
            returnStr += array[i] + " ";
        }
        return returnStr;
    }
}



