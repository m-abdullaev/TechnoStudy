package Homework;

import java.util.Arrays;

public class ForHomeWork {

    public static void main(String[] args) {
        int number = 123;
        String converted2string = Integer.toString(number);
        char[] myArray = new char[converted2string.length()];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = converted2string.charAt(i);
        }
        System.out.println(Arrays.toString(myArray));
        System.out.println("*");
        char[] newArray = new char[myArray.length];
        for (int j = 0; j < myArray.length; j++) {
            newArray[j] = myArray[myArray.length - 1 - j];
        }
        System.out.println(Arrays.toString(newArray));
    }
}



