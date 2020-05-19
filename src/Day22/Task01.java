package Day22;

import java.util.ArrayList;
import java.util.Random;

public class Task01 {
    // create a method that will generate arrayList of double with random double values
    public static ArrayList<Double> generateList() {
        //step 1: create arrayList
        ArrayList<Double> list = new ArrayList<>();

        //step 2: fill array list with random double numbers
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            //1. way random
//            list.add(Math.random()*100);
            //2 way
            list.add(random.nextDouble() * 100);
        }

        //step 3: return array list;
        return list;
    }

    // create a method to retrieve an element at specified index from given arrayList
    public static Double retrieveElement(ArrayList<Double> list, int position) {
        return list.get(position);

    }


}


