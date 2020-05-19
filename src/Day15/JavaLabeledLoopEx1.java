package Day15;

public class JavaLabeledLoopEx1 {

    public static void main(String[] args) {


        loop_1:
        for (int i = 0; i < 10; i++) {
            loop_2:
            while (i < 5) {
                loop_3:
                do {

                } while (i < 3);
            }
        }
    }
}
