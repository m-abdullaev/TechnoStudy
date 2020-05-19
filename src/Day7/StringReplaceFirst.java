package Day7;

public class StringReplaceFirst {

    public static void main(String[] args) {

        /*
        Replaces the first occurrence of a substring that matches the given regular
        expression with the given replacement
         */

//        String text = "software DEVELOPER inc";
//        System.out.println(text.replaceFirst("[A-Z]", "d" ));

        String text = "Edit the Expression & Text to see matches";

        System.out.println(text);
        System.out.println(text.replaceFirst("[A-Z]", "THE "));

    }
}
