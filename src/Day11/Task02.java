package Day11;


import java.util.Random;
import java.util.Scanner;

public class Task02 {
    // Let user provide a number between 0 and 3
    // then generate a random number between 0 and 3
    // and check if provided number is equal to generated number
    // if they are equal print out "You Won the Game!!!"
    // else "Game Over!!!"
    ///    "Number was: {generated number}"
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number bet 0-3");
        int input = scan.nextInt();
        Random random = new Random();
        int generatedN = random.nextInt(4);


        if (input == generatedN) {
            System.out.println("You won the Game");
        } else
            System.out.println("You lost");
        System.out.println("Generated: " + generatedN);


    }


}
