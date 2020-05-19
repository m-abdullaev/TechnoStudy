package Day16;

public class JavaArray {
    public static void main(String[] args) {
        // how to create an array
        int[] a = new int[3]; // created integer array with size 3

        // creating array when you don't know what will be your values
        String[] names = new String[3]; // created String array with size 3
        names[0] = "John";
        names[1] = "Bob";
        names[2] = "Alice";

        /// creating array when you know your values
        String[] students = {"Samil", "Dogan", "Hafize"};

        // to get size of array
        System.out.println("student count: " + students.length);


    }
}
