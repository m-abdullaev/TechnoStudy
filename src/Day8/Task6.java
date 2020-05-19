package Day8;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter your weight: ");
//        double weight = scanner.nextDouble();
//        System.out.println("Please enter our height: ");
//        double height = scanner.nextDouble();
//        double m = (weight) / (height * height);
////        double height2 = height*2;
////        double m2 = m*m;
//        System.out.println("Your BMI is: " + m);
        Scanner scan = new Scanner(System.in);


        System.out.println("enter your weight");
        double weigth = scan.nextDouble();
        System.out.println("enter your height");
        double height = scan.nextDouble();
        double heightSquare = height * height;
        double formula = (double) weigth / heightSquare;
        System.out.println("BMI is " + formula + " kg/m2");


    }
}
