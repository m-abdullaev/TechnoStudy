package Day7;

public class Task3 {

    public static void main(String[] args) {

        String text = "software DEVELOPER inc";

        int beginningIndex = text.indexOf('s');
        int endingIndex = text.indexOf(' ');

        String part1 = text.substring(beginningIndex, endingIndex);
        System.out.println("part1: " + part1);

        beginningIndex = text.indexOf(" DEVELOPER");
        String part2 = text.substring(beginningIndex);
        System.out.println("part2: " + part2);


        part1 = part1.toUpperCase();

        System.out.println(part1 + part2);


    }
}
