package Day24;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Task2 {
    // create HashSet, TreeSet, LinkedHashSet of given integers and print them
    // [1,6,3,5,2,7,8,4,3,6]
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet();
        hashSet.add(1);
        hashSet.add(6);
        hashSet.add(33);
        hashSet.add(15);
        hashSet.add(22);
        hashSet.add(7);
        hashSet.add(8);
        hashSet.add(4);
        hashSet.add(3);
        hashSet.add(6);
        System.out.println("HashSet: " + hashSet);

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(6);
        linkedHashSet.add(33);
        linkedHashSet.add(15);
        linkedHashSet.add(22);
        linkedHashSet.add(7);
        linkedHashSet.add(8);
        linkedHashSet.add(4);
        linkedHashSet.add(3);
        linkedHashSet.add(6);
        System.out.println("Linked HashSet: " + linkedHashSet);

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(6);
        treeSet.add(33);
        treeSet.add(15);
        treeSet.add(22);
        treeSet.add(7);
        treeSet.add(8);
        treeSet.add(4);
        treeSet.add(3);
        treeSet.add(6);
        System.out.println("TreeSet: " + treeSet);

    }
}
//    // create HashSet, TreeSet, LinkedHashSet of given integers and print them
//    // [1, 6, 33, 15, 22, 7, 8, 4, 3, 6]
//
//    public static void main(String[] args) {
////        List<Integer> list = Arrays.asList(1, 6, 33, 15, 22, 7, 8, 4, 3, 6);
//        ArrayList<Integer> list = generateNumbers();
//
//        HashSet<Integer> hashSet = new HashSet<>(list);
//        System.out.println("HashSet: " + hashSet);
//
//        TreeSet<Integer> treeSet = new TreeSet<>(list);
//        treeSet.add(-50);
//        System.out.println("TreeSet: " + treeSet);
//
//        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(list);
//        linkedHashSet.add(-50);
//        System.out.println("LinkedHashSet: " + linkedHashSet);
//    }
//
//    private static ArrayList<Integer> generateNumbers() {
//        ArrayList<Integer> result = new ArrayList<>();
//        int[] numbers = {1, 6, 33, 15, 22, 7, 8, 4, 3, 6};
//        for(int number : numbers) {
//            result.add(number);
//        }
//        return result;
//    }