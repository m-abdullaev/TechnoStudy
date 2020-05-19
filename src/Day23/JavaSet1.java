package Day23;

import java.util.HashSet;

public class JavaSet1 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Blue");
        set.add("Red");
        set.add("red");
        set.add("rED");
        System.out.println(set);
    }

}

//    public static void createSet() {
//        // 1. way
//        Set<Integer> set = new HashSet<>();
//        // 2. way
//        HashSet<Integer> set1 = new HashSet<>();
//    }
//
////    public static void main(String[] args) {
////        ArrayList<String> nameList = new ArrayList<>();
////        nameList.add("Dos");
////        nameList.add("Nurhan");
////        nameList.add("Halit");
////        nameList.add("Dos");
////        nameList.add("Dos");
////        nameList.add("Dos");
////
////        HashSet<String> nameSet = new HashSet<>();
////        nameSet.add("Dos");
////        nameSet.add("Nurhan");
////        nameSet.add("Halit");
////        nameSet.add("Dos");
////        nameSet.add("dos");
////        nameSet.add("DOS");
//          public static void main(String[] args) {
//    HashSet<Integer> set = new HashSet<>();
//    boolean add_1 = set.add(1);
//    boolean add_2 = set.add(2);
//    boolean add_3 = set.add(3);
//    boolean add_3_again = set.add(3);
//    boolean add_1_again = set.add(1);
//}
//}