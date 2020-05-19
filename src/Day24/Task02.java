package Day24;

import java.util.*;

public class Task02 {
    // create HashSet, TreeSet, LinkedHashSet of given integers and print them
    // [1, 6, 33, 15, 22, 7, 8, 4, 3, 6]

    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(1, 6, 33, 15, 22, 7, 8, 4, 3, 6));
        System.out.println("HashSet: " + hashSet);

        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(1, 6, 33, 15, 22, 7, 8, 4, 3, 6));
        System.out.println("TreeSet: " + treeSet);

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(1, 6, 33, 15, 22, 7, 8, 4, 3, 6)); // or hashSet
        System.out.println("LinkedHashSet: " + linkedHashSet);
    }
}


