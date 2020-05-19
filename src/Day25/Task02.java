package Day25;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task02 {
    // create method that returns map of colors
    // using colors array = {Red, Yellow, Green, Blue}
    // position, color
    //ex: 1 Red
    //    2 Yellow
    //    3 Green
    //    4 Blue
    public static HashMap<Integer, String> getColorMap() {
        String[] arr = {"Red", "Yellow", "Green", "Blue"};
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 1; i < arr.length; i++) {
            int position = i + 1;
            String color = arr[i];
        }
        return map;
    }

    // create method that prints positions of colors in map
    public static void printsPositions(HashMap<Integer, String> colors) {
        Set<Integer> positions = colors.keySet();
        System.out.println("Positions: " + positions);
    }

    public static void printsColorsAndPositions(HashMap<Integer, String> colorsP) {
        for (Map.Entry<Integer, String> colorsPO : colorsP.entrySet()) {
            Integer key = colorsPO.getKey();
            String value = colorsPO.getValue();

            System.out.println("Key:" + key + "   Value:" + value);
        }
    }

    public static void main(String[] args) {
        HashMap<Integer, String> colorMap = getColorMap();

    }
}
