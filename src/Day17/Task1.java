package Day17;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] arrs = new int[10];
//        int sum =0;
        for (int i = 0; i < arrs.length; i++) {
            arrs[i] = random.nextInt(11);

        }
        System.out.println(Arrays.toString(arrs));

        System.out.println("--------");
        for (int arr : arrs) {
            if (arr == 0) {
                System.out.println("It has zero ");
            }
        }
        System.out.println("----------");
        for (int arr : arrs) {
            if (arr == 10) {
                System.out.println("it Has 10 ");
            }
        }
        System.out.println("-------");
        boolean hasZero = false;
        boolean hasTen = false;
        for (int arr : arrs) {
            if (arr == 0) {
                hasZero = true;
            } else if (arr == 10) {
                hasTen = true;
            }
        }
        if (hasZero && hasTen) {
            System.out.println("It has Zero and Ten");
        }
    }
}