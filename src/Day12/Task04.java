package Day12;

import java.util.Random;
import java.util.Scanner;

public class Task04 {
    // write a program that prints word representation of your number
    //      and number is between 0 and 5
    // ex: 0 => zero
    // ex: 3 => three
    public static void main(String[] args) {


        Random random = new Random();
        int randomIndex = random.nextInt(10);

        switch (randomIndex) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Input is not good");

        }
        System.out.println(randomIndex);


    }

}
