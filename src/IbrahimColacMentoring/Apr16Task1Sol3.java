package IbrahimColacMentoring;

import java.util.Arrays;

public class Apr16Task1Sol3 {
    //    Write a method called putting that accepts an integer as an its parameter
    //    and returns the replaced numbers into the array.
    //    Example 1:
    //    int n = 35274
    //    arr = {3,5,2,7,4};
    public static void main(String[] args) {
        int n = 35274;
        int len = Integer.toString(n).length();
        int[] arr = new int[len];
        int index = len - 1;

        while (n != 0) {
            int num = n % 10;
            System.out.print(num + " ");
            n /= 10;
            arr[index] = num;
            index--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
