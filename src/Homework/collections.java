package Homework;

import java.util.*;

public class collections {
    public static void main(String[] args) {
        //Create a method name is map1()
        //
        //parameters are one Integer -String map and one integer
        //
        //return type is String
        //
        //return the value of the integer
        //
        //Example:
        //
        //Map is
        //                1 ,  "Lion"
        //                2 ,  "Tiger"
        //                3 ,  "Elephant"
        //                4 ,  "Cat"
        //                5  , "Dog"
        //
        //Integer 3
        //
        //Result should be Elephant

        HashMap<Integer, String> dict = new HashMap<>();
        dict.put(1, "Lion");
        dict.put(2, "Tiger");
        dict.put(3, "Elephant");
        dict.put(4, "Cat");
        dict.put(5, "Dog");


        System.out.println(map1(dict, 1));
        System.out.println(map1(dict, 2));

    }

    public static String map1(HashMap<Integer, String> dict, int num) {
        return dict.get(num);
    }


}




