package ZynepMentoring;

import java.util.Random;

public class ForLoop {
    public static void main(String[] args) {
        Random random = new Random();
        int totalNum = 0;
        for (int i = 0; i < 4; i++) {
            int num = random.nextInt(20);
            System.out.println("random numbers: " + num);
            totalNum += num;
        }
        System.out.println("TotalNum: " + totalNum / 4);
    }
}
