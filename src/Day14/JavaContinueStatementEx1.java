package Day14;

public class JavaContinueStatementEx1 {
    // check string, if it has letter a, stop the loop
    // Stay at home
    // S
    // t
    // stop


    public static void main(String[] args) {
        String text = "Stay at home";

        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);

            if (letter == ' ') {
                continue;
            }

            System.out.print(letter);
        }

        System.out.println("end of code");


    }
}
//    public static void main(String[] args) {
//
//        for(int i = 0; i < 5; i++) {
//            if(i <= 2) {
//                continue;
//            }
//
//            System.out.println( i );
//        }
//
//    }


//    public static void main(String[] args) {
//        String text = "Stay at home";
//
//        for(int i = 0; i < text.length(); i++) {
//            char letter = text.charAt( i );
//
//            if(letter == ' ' || letter == 'a') {
//                continue;
//            }
//
//            System.out.println( letter );
//        }