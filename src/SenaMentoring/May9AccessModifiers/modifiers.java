package SenaMentoring.May9AccessModifiers;

import java.util.HashSet;

public class modifiers {
    // 1. create a method named as stateTax,
    // which is accessible just within the same package!
    // return type is double, parameter is String.
    // remove any $ and , signs from the String, convert into double and calculate state tax
    // by getting the 7.75 percent of the double value.

    double stateTax(String str) {
        str.replace("$", "");
        str.replace(",", "");
        double number = Double.valueOf(str);
        double result = number * 0.0775;
        return result;
    }
    // 2. create a method named as britToAmerican,
    // which is accessible from different package too but just for sub classes!
    // return type is HashSet<String> set, parameter is HashSet<String> set, String colour, String color.
    // change all "colour" into "color" from the HashSet

    HashSet<String> set(HashSet<String> set, String colour, String color) {
        for (String str : set) {
            if (str.equalsIgnoreCase(colour)) {
                str = color;
            }
        }

        return set;
    }
}
