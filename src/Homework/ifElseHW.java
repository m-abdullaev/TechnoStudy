package Homework;


import java.net.SocketImpl;
import java.util.Scanner;

public class ifElseHW {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int currentSpeed = scan.nextInt();
        // code start here
        boolean isDriverLicenceAvailable = scan.nextBoolean();

        if (currentSpeed >= 55 && currentSpeed <= 74) {
            System.out.println("Fine is 100 ");
        }


    }
}
