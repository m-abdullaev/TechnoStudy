package Day4;

public class JavaNarrowingCasting {

    public static void main(String[] args) {

        int number = 50;

        long longNumber = number;

        System.out.println(number);
        System.out.println(longNumber);


        byte byteNumber = 10;
        double doubleNumber = byteNumber;
        System.out.println(byteNumber);
        System.out.println(doubleNumber);


        System.out.println("Exam Results:");

        int studentA = 90;
        int studentB = 80;
        int studentC = 50;

        double avg = (studentA + studentB + studentC) / 3.0;

        System.out.println("Average result");
        System.out.println(avg);


    }
}
