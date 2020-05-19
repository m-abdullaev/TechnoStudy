package Day7;

public class StringReplaceAll {

    /*
    Replaces each substring of this string that matches the given regular
     expression with the given replacement
     */
    public static void main(String[] args) {
//
//        String text = "software DEVELOPER inc";
//        System.out.println(text.replaceAll("[A-Z]", "d" ));
//        String text = "Edit the Expression & Text to see matches";
//        System.out.println( text.replaceAll( "[A-Z]", "%" ) );
        String text = "Edit the Expression & Text To See Matches";

        System.out.println("original: " + text);
        System.out.println("after replaceAll: " + text.replaceAll("[A-Z]", "%"));
        System.out.println("after replace: " + text.replace("E", "%").replace("T", "%"));

    }
}
