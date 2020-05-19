package Day16;

public class JavaArrayEx02 {

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Trudy"};
        //                   0       1       2

        for (int i = 0; i < names.length; i++) {
            System.out.println(i + ". " + names[i]);
        }

    }
}