package Day6;

public class StringEqualsIgnoreCase {
    public static void main(String[] args) {
//        String t1 = "Hello";
//        String t2 = "Bonjour";
//
//        //System.out.println(t1.equalsIgnoreCase( t2 )); // false
//        //System.out.println(t1.equalsIgnoreCase( "Hello")); // true
//
//        System.out.println( t1.equalsIgnoreCase( "hello" ) ); // true

        String s1 = "Hello";

        System.out.println("is hello same as Hello?" + s1.equalsIgnoreCase("Hello"));
        System.out.println("is hello same as Hello?" + s1.equalsIgnoreCase("hello"));

    }
}