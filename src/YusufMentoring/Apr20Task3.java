package YusufMentoring;

import java.util.Random;

public class Apr20Task3 {
    //Task 3
    //Write a method which mixes up the letters of a given String
    //return type and parameters will be String
    public static String mixUpLetters(String str) {
        char array[] = str.toCharArray();
        char newArray[] = new char[str.length()];
        Random rand = new Random();
        String x = "";
        for (int i = 0; i < str.length(); i++) {
            int randomNumber = rand.nextInt(str.length());
            String randomNumberString = String.valueOf(randomNumber);

            if (!x.contains(randomNumberString)) {
                newArray[randomNumber] = array[i];
                x += randomNumber;
            } else {
                randomNumber = rand.nextInt(str.length());
                i--;
            }
        }
        String mixUp = new String(newArray);
        return mixUp;

    }
}
