package Day14;

public class Task05 {
    //print all even numbers between 0 and 100
    //using for loop and continue statement

    //hint: if(i % 2 == 0)  // even number
    //      if(i % 2 != 0) // odd number
    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("Even numbers: " + i);
                continue;
            }
            System.out.println("Odd numbers: " + i);


        }
    }
}
