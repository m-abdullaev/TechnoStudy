package Day15;

public class Task0004 {
    public static void main(String[] args) {
        loop1:
        for (int a = 0; a < 5; a++) {
            System.out.println("*****");
            loop2:
            for (int b = 0; b < 5; b++) {
                System.out.println(" ****");
                loop3:
                for (int c = 0; c < 5; c++) {
                    System.out.println("  ***");
                    loop4:
                    for (int d = 0; d < 5; d++) {
                        System.out.println("   **");
                        loop5:
                        for (int e = 0; e < 5; e++) {
                            System.out.println("    *");
                            break loop1;
                        }


//            System.out.println(a);

                    }
                }
            }
        }
    }
}
