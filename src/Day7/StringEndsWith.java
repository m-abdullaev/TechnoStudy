package Day7;

public class StringEndsWith {

    public static void main(String[] args) {

        /*Checks whether a string ends with the specified character(s)

         */
        String text = "Hello world";
        System.out.println("Is text starts with hello? " + text.endsWith("Hello")); // true
        System.out.println("Is text starts with hello? " + text.endsWith("hello")); // false
        System.out.println("Is text starts with hello? " + text.endsWith("world")); //false


    }
}
