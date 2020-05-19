package ShavkatMentoring;

import java.util.Scanner;

public class DoWhileLoopTask3 {
    public static void main(String[] args) {
        /*
        create one int
        while int is less then 100
        print the number
        increment the int 5 time
        for example: 0   5   10  15  20
        */
        Scanner dp = new Scanner(System.in);
        int a = dp.nextInt();

        do {
            System.out.print(a + " ");
            a += 5;
        } while (a <= 100);
    }
}
