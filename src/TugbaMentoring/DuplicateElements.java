package TugbaMentoring;

import java.util.Arrays;

public class DuplicateElements {
    public static void main(String[] args) {
        // find the duplicate elements

        int[] arr = {1, 1, 2, 3, 4, 2, 5};

        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println(arr[i] + " is a duplicate element");
            }
        }
    }
}
// find the duplicate elements

//    int[] arr = {1, 1, 2, 3, 4, 2, 5};
//
//        for (int i = 0; i < arr.length; i++) {
//        for (int j = i ; j < arr.length; j++) {
//        if (arr[i] == arr[j] && i != j) {
//        System.out.println(arr[i] + " is myArray duplicate element");
//        }
//        }
//        }
//
//        }