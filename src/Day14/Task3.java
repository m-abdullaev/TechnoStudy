package Day14;

public class Task3 {
    //print all even numbers between 0 and 100

    // even numbers: 2, 4, 6, 8, 10
    // odd numbers : 1, 3, 5, 7, 9
    // part 2: using only one loop, try to print even and odd numbers

    public static void main(String[] args) {

        for (int even = 0, odd = 1; even <= 100 && odd <= 100; even += 2, odd += 2) {
            System.out.println(even + " " + odd);


        }
    }

}
//        // 1. way
//        for(int even = 0; even <= 100; even += 2) {
//            System.out.println( even + " " + (even - 1) );
//        }
//
//        // 2.way
//        for(int even = 0, odd = 1; even <= 100 && odd <= 100; even += 2, odd += 2) {
//            System.out.println( even + " " + odd );
//        }
//
// 3. way

//        for(int i = 0; i <= 100; i++) {
//                if(i % 2 == 0) { // even number
//                System.out.println( "even: " + i );
//                } else {
//                System.out.println( "odd: " + i );
//                }

// 0 + 2 = 2
// 2 + 2 = 4
// 4 + 2 = 6
//        for(int i = 0; i <= 20; i = i + 2) {
//                System.out.println( i );
//                }