package Day6;

public class StringEquals {
    /*
     equals()
    Compares two strings. Returns true if the strings are equal, and false if not

    boolean
     */

    public static void main(String[] args) {
//        String t1 = "Hello";
//        String t2 = "Bonjour";
//
//        //System.out.println(t1.equals( t2 )); // false
//        //System.out.println(t1.equals( "Hello")); // true
//
//        System.out.println(t1.equals( "hello")); // ???

        String s1 = "Hello";

        System.out.println("Is hello same is Hello? " + s1.equals("Hello"));

        System.out.println("is Hello same as hello: " + s1.equals("hello"));

    }
}