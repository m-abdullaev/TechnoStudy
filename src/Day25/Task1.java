package Day25;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Task1 {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Manhattan", 100001);
        map.put("Brooklyn", 11235);
        map.put("Queens", 11345);

        HashMap<String, Integer> secondMap = copyMap(map);
//        printZip(map);
//        printRemoveAll(map);
//        printSize(map);
//        copyMap(map);
    }

    // create method to copy all of the mappings
    // from the specified map to another map
    private static HashMap<String, Integer> copyMap(HashMap<String, Integer> map) {
        HashMap<String, Integer> secondMap = new HashMap<>();
        secondMap.putAll(map);
        return secondMap;
    }

    //create method to remove all of the mappings/entries from a map
    private static void printRemoveAll(HashMap<String, Integer> map) {
        //1. way
        map.clear();

        //2. way
        Set<String> keys = new HashSet<>(map.keySet());
        for (String key : map.keySet()) {
            map.remove(key);
        }


    }

    // create method that return size of your map
    private static int printSize(HashMap<String, Integer> map) {
        return map.size();

    }

    // Write a Java program to associate
    // the specified value with the specified key in a HashMap.
    private static void printZip(HashMap<String, Integer> map) {
        System.out.println(map);
    }

}
