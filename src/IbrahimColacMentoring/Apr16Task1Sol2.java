package IbrahimColacMentoring;

import java.util.Arrays;

public class Apr16Task1Sol2 {
    //    Write a method called putting that accepts an integer as an its parameter
    //    and returns the replaced numbers into the array.
    //    Example 1:
    //    int n = 35274
    //    arr = {3,5,2,7,4};
    public static void main(String[] args) {
        int n = 35274;
        int len = Integer.toString(n).length();  // converted int to String and got the length from String

        int index = len - 1; // identified the last element index in Array

        int[] arr = new int[len]; // created empty Array
        for (int i = n; i != 0; i /= 10) { // circling  from n to 0 (35274 => 3527 =>352 => 35 => 3 =>0)

            arr[index] = i % 10; // read index backward(4 => 4, 3 => 7, 2 =>2, 1 =>5, 0 =>3)
            index--; // index going down
        }
        System.out.println(Arrays.toString(arr));
    }
}
