package Day14;

public class Task1 {
    public static void main(String[] args) {
        // write a java program which calculate sum from [0 to 5];
        // use for-loop
        // 0+1+2+3+4+5 = 15

        int result = 0;

        for (int x = 0; x <= 5; x++) {
            System.out.println("for: " + x);
            result += x;

        }
        System.out.println("Result is: " + result);

    }
}
