package Day16;

public class Task02 {
    // Write a Java program to sum values of an array
    // constraints: size should be 5
    // {10, 10, 30, 40, 10} => 100
    public static void main(String[] args) {
        int[] array = {10, 10, 30, 40, 10};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum is: " + sum);
    }
}
