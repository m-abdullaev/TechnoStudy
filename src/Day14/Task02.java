package Day14;

public class Task02 {
    // write a java program which will show
    // multiplication table of 2

    //ex:
//    2 x 1 = 2
//    2 x 2 = 4
//    2 x 3 = 6
//    2 x 4 = 8
//    2 x 5 = 10
//    2 x 6 = 12
//    2 x 7 = 14
//    2 x 8 = 16
//    2 x 9 = 18
//    2 x 10 = 20
    public static void main(String[] args) {
        int two = 2;
        int result;

        for (int i = 1; i <= 10; i++) {
            result = two * i;
            System.out.println(two + " x " + i + " = " + result);
        }

    }
}
