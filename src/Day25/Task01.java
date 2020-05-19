package Day25;

import java.util.HashMap;

public class Task01 {
    // Write a Java program to associate
    // the specified value with the specified key in a HashMap.
    // constrains: do not use Map<String, Double>

    public static HashMap<String, Integer> getStudentGrades() {
        HashMap<String, Integer> student = new HashMap<>();
        student.put("Bulut", 80);
        student.put("Furkan", 85);
        student.put("Amal", 90);
        student.put("Abduhamid", 75);
        return student;

    }

    // create method to copy all of the mappings
    // from the specified map and return copied map
    public static HashMap<String, Integer> getCopy(HashMap<String, Integer> map) {
        return new HashMap<>(map);
    }

    // create method to remove specified entry from map
    public static void removeFromMap(HashMap<String, Integer> map, String key) {
        map.remove(key);
    }

    // create method to get value at specified position
    public static String getStudentMark(HashMap<String, String> map, String key) {
        return map.get(key);
    }

    // create method to check if key is present/exists in the map
    public static boolean hasKey(HashMap<String, Integer> map, String key) {
        return map.containsKey(key);
    }

    // create method to check if value is present/exists in the map
    public static boolean hasValue(HashMap<String, String> map, String value) {
        return map.containsValue(value);
    }

    // create method to remove all of the mappings/entries from a map
    private static void printRemoveAll(HashMap<String, Integer> map) {
        //1. way
        map.clear();
    }

    public static void main(String[] args) {
        HashMap<String, Integer> student = getStudentGrades();
        System.out.println(student);

    }
}
