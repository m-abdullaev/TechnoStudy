package mAliMentoring;

import java.util.HashSet;

public class WedApr22Task1 {

    public static void main(String[] args) {

        HashSet<Double> hashSet = new HashSet<>();

        hashSet.add(3.23);
        hashSet.add(3.10);
        hashSet.add(5.12);
        hashSet.add(10.12);
        hashSet.add(23.12);

        double total = 0.0;

        System.out.println(hashSet);

        for (Double d1 : hashSet) {
            total += d1; //total = total + d1;
        }

        System.out.println(total);

    }
}
