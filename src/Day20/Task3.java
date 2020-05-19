package Day20;

import java.util.Arrays;

public class Task3 {
    // create method that accepts names and print them in one line
    public static void main(String[] args) {
        printNames("Jon", "Aria");

        printNames("Mark", "Max", "Maria");
    }

    // create method print given names in one line
    public static void printNames(String... names) {
        System.out.println(Arrays.toString(names));

        //2.way
//        for(String name : names) {
//            System.out.print(name + " ");
//        }
    }
}


//    public static void main(String[] args) {
//        names();
//    }
//
//    public static void names(String... args){
//        String str = "Johnny";
//        System.out.println("Your name: " + str);



