package Day6;

public class StringIndexOf {

    /*
     indexOf()
    Returns the position of the first found
    occurrence of
    specified characters in a string
    * */

    public static void main(String[] args) {

//        String t1 = "Hello";
//        System.out.println(t1.indexOf( 'o'));

//        String t2 = "Good Morning!!!";
//        System.out.println(t2.indexOf( "mor" ));

        String text = "Good";

        System.out.println("index of G: " + text.indexOf("G"));

        text = "Good Morning";
        System.out.println("index of mor " + text.indexOf("Mor"));


    }
}
