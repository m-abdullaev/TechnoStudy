package Day14;

public class JavaLoopEx1 {
    public static void main(String[] args) {

        // to get last value of i
        int lastValue_i = 0;
        for (int i = 0; i < 5; i++) {
            lastValue_i = i;
        }
        System.out.println(lastValue_i);


        // infinite loop
        for (int i = 0; ; i++) {
            System.out.println("infinite: " + i);
        }

    }
}
