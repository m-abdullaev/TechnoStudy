package Day7;

public class StringReplace {

    /*
     replace()
    Searches a string for a specified value, and returns a new string where the
     specified values are replaced
     String
     */

    public static void main(String[] args) {

        String text = "Hello World";
        System.out.println(text);
        System.out.println(text.replace("Hello", "Hi").replace("World", "Everybody"));
//        System.out.println(text.replace("World", "Everybody"));


    }
}
