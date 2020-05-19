package Day14;

public class Task01 {
    //write a java program that print numbers from 0 to 5
    //using for loop
    public static void main(String[] args) {
        int result = 0;
        for (int i = 0; i <= 5; i++) {
            result += i;
            System.out.println("number: " + i);
        }
        System.out.println("sum is:" + result);

    }
}
