package Day5;


import java.util.Scanner;

public class scanner5 {

    public static void main(String[] args) {

        // boolean -> true and false
        // create one boolean do you want insurance?
        Scanner S1 = new Scanner(System.in);
        System.out.println("Do you want insurance ");
        boolean insurance = S1.nextBoolean();
        System.out.println("do you want insurance: " + insurance);

        // create boolean do you want two way ticket
        System.out.println("Do you want two way ticket ");
        boolean twoWay = S1.nextBoolean();
        System.out.println("Answer for two way question: " + twoWay);

    }
}
