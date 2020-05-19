package Homework.DateAndTimeTryAndCatch;

public class TryCatch2 {
    /**
     * Create Method divide()
     * This method has 2 int parameters num1 , num2
     * return is int
     * Divide num1 to num2 and return the result.
     * if num2 is 0 then return should be -1
     * NOTE : Use try catch block not if statement
     */
    public static int divide(int num1, int num2) {
        try {
            int result = num1 / num2;

        } catch (ArithmeticException ex) {
            return -1;
        }
        return num1 / num2;
    }
}
