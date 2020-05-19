package Day13;

public class JavaWhileEx2 {
    public static void main(String[] args) {
//    infinite loop
//        while(true){
//
//        }

        // example shows that we can use logical operators
//        while("text".equals( "text" ) && 4 < 2){
//
//        }

        //infinite loop
//        while(true){
//            System.out.println("Forever!!!");
//        }

        String text = "Sample";

        while (text.isEmpty() || text.length() > 4) {
            System.out.println("!!!");
        }
    }
}

