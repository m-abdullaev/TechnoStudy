package Day7;

public class Task7 {

    //Given two strings, a and b,
    // return the result of putting them together in the order bbaa,
    //
    // e.g. "Hi" and "Bye" returns "ByeByeHiHi".


    public static void main(String[] args) {

        String a = "Bye";
        String b = "Hi";
        System.out.println(a + a + b + b);

        // part 2

        System.out.println(b.concat(b).concat(a).concat(a));

    }
}
