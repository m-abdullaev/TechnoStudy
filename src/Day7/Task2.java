package Day7;

public class Task2 {

    public static void main(String[] args) {

        //String text = "software DEV";
        //System.out.println(text.toUpperCase());

        String text = "software DEVELOPER in test";
        String part1 = text.substring(0, 8); // can use to get correct index
        System.out.println("part1: " + part1);
        String part2 = text.substring(9);
        System.out.println("part2: " + part2);

        // second step uppercase part1 and reassign to part1 variable
        part1 = part1.toUpperCase();

        // 3 print them together

        System.out.println(part1 + " " + part2);


    }
}
