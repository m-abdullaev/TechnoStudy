package Day12;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
            /*
    Write a Java program to input mark of subject Physics
    calculate grade according to given conditions:

    If percentage >= 90% : Grade A
    If percentage >= 80% : Grade B
    If percentage >= 70% : Grade C
    If percentage >= 60% : Grade D
    If percentage >= 40% : Grade E
    If percentage < 40% : Grade F

    //input:
    //     Physics: 90,
    // output
           Grade A
     */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter grade: ");
        double mark = scanner.nextDouble();

        if (mark >= 90) {
            System.out.println("Grade A");
        } else if (mark >= 80) {
            System.out.println("Grade B");
        } else if (mark >= 70) {
            System.out.println("Grade C");
        } else if (mark >= 60) {
            System.out.println("Grade D");
        } else if (mark >= 50) {
            System.out.println("Grade E");
        } else if (mark < 40) {
            System.out.println("Grade F");
        }


    }
}
//    Random random = new Random();
//    int percentage = 1000;//random.nextInt( 101 );
