package Day16;

public class Task1 {
    public static void main(String[] args) {
        // Write a Java program to sum values of an array
        // constraints: size should be 5
        int[] numbers = {1, 2, 3, 4, 5};

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("sum is: " + sum);

    }
}

