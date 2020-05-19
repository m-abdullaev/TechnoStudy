package Day23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaArrayAndArrayList {
    public static void main(String[] args) {

    }

    public static void oneDimensional() {
        int[] numArray = {1, 2, 3};
        //1. way
        List<Integer> numList = Arrays.asList(1, 2, 3);
        //2. way
        ArrayList<Integer> numList2 = (ArrayList<Integer>) Arrays.asList(1, 2, 3);
    }


    public static void twoDimensional() {
        //array
        //1. way
        int[][] numArray = {
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4},
        };
        //2. way
        int[] row1 = {1, 2, 3, 4};
        int[] row2 = {1, 2, 3, 4};
        int[] row3 = {1, 2, 3, 4};
        int[][] numArray2 = {
                row1,
                row2,
                row3
        };

        // ArrayList

        // list of integer list
        ArrayList<Integer> listRow1 = new ArrayList<>();
        listRow1.add(1);
        listRow1.add(2);
        listRow1.add(3);
        ArrayList<Integer> listRow3 = new ArrayList<>();
        ArrayList<Integer> listRow2 = new ArrayList<>();


        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list.add(listRow1);
        list.add(listRow2);
        list.add(listRow3);

        ArrayList<Integer> integerArrayList = list.get(0);
        integerArrayList.get(0);// value at row1 and position 0


        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                list.get(i).get(j);
            }
        }
    }
}

//    public static void oneDimensional() {
//        // array
//        int[] array1 = new int[5];
//        int[] array2 = {4, 2, 9, 5};
//
//        //ArrayList
//        ArrayList<Integer> list1 = new ArrayList<>();
//        // 1. way of creating ArrayList
//        ArrayList<Integer> list2 = (ArrayList<Integer>) Arrays.asList(4, 2, 9, 5);
//        // 2. way of creating ArrayList
//        List<Integer> list3 = Arrays.asList(4, 2, 9, 5);
//    }

//    public static void twoDimensional() {
////        // 2D array
////        //1. way
////        int[][] array1 = new int[5][5];
////        //2. way
////        int[][] array2 = {
////                {4, 2, 9, 5},
////                {4, 2, 9, 5},
////        };
////        //3. way
////        int[] row1 = {4, 2, 9, 5};
////        int[] row2 = {4, 2, 9, 5};
////        int[][] array3 = {
////                row1,
////                row2,
////        };
//
//
//        // 2D ArrayList
//        ArrayList<Integer> subList1 = new ArrayList<>();
//        subList1.add(1);
//        subList1.add(2);
//        subList1.add(3);
//
//        ArrayList<Integer> subList2 = new ArrayList<>();
//        subList2.add(10);
//        subList2.add(20);
//        subList2.add(30);
//
//        ArrayList<ArrayList<Integer>> generalList = new ArrayList<>();
//        generalList.add(subList1);
//        generalList.add(subList2);
//
//    }
//
//    public static void main(String[] args) {
//        twoDimensional();
//    }
//
//}