package Day17;


import java.util.Arrays;
import java.util.Random;

public class Task01 {
    // Fill array with random values using Random/Math.random, 0 <= random N <= 10
    public static void main(String[] args) {
        // part 1
        System.out.println("------------------");
        Random random = new Random();
        int[] numbers = new int[10];
        // 1 way to print
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(11);
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("------------------");
        // 2 way to print
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        // part 2
        System.out.println("\n------------------");
        for (int number : numbers) {
            if (number == 0) {
                System.out.println("It has zero");
            }
        }
        System.out.println("\n------------------");
        for (int number : numbers) {
            if (number == 10) {
                System.out.println("It has ten");
            }
        }
        System.out.println("\n------------------");
        boolean hasZero = false;
        boolean hasTen = false;
        for (int number : numbers) {
            if (number == 0) {
                hasZero = true;

            } else if (number == 10) {
                hasTen = true;
            }

            if (hasTen && hasZero) {
                System.out.println("It has zero and ten");
            }
        }
    }
}
