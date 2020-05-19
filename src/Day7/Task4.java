package Day7;

public class Task4 {

    //  Write a Java program to replace all the 'd' characters with 'f' characters
    //      input: The quick brown fox jumps over the lazy dog.
    //      output: The quick brown fox jumps over the lazy fog.

    // part 2:
    // replace all the 'a','t','e' characters with 'f'

    // part 3:
    // replace all the 'o','q','r' characters with 'L' using regex


    public static void main(String[] args) {

        //  Write a Java program to replace all the 'd' characters with 'f' characters
        //      input: The quick brown fox jumps over the lazy dog.
        //      output: The quick brown fox jumps over the lazy fog.

        String text = "The quick brown fox jumps over the lazy dog.";
        System.out.println(text.replace("d", "f"));
        System.out.println(text.replaceAll("a", "f")
                .replaceAll("t", "f").replaceAll("e", "f"));

        System.out.println(text.replaceAll("o", "L")
                .replaceAll("r", "L").replaceAll("e", "L"));
    }
}
