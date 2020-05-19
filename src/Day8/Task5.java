package Day8;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

//        Scanner temp = new Scanner(System.in);
//        System.out.println("F: ");
//        double F = temp.nextDouble();
//        double C = F;
//        C *= 5/9;
//
//        System.out.println("The temp is: " + C );

        Scanner scanner = new Scanner(System.in);
//        System.out.println( "Enter temperature in Fahrenheit:" );
//        int fahrenheit = scanner.nextInt();
//
//        // formula
//        // (32°F − 32) × 5/9 = 0°C
//        // c = (f-32)*5/9
//        int celsius = (fahrenheit - 32) * 5 / 9;
//        System.out.println( "Converted to Celsius: " + celsius );

        System.out.println("Enter temperature in celsius: ");
        int celsius = scanner.nextInt();

        int fahrenheit = (celsius * 9 / 5 + 32);

        System.out.println(" Your temperature in F is: " + fahrenheit);

//      (0°C × 9/5) + 32 = 32°F


    }
}
