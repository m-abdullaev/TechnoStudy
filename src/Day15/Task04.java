package Day15;

public class Task04 {

    public static void main(String[] args) {

        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                if (col >= row) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}
