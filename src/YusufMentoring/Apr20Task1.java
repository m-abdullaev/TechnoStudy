package YusufMentoring;

public class Apr20Task1 {
    //Task 1
    //Create a method that checks every letter if they are vowel
    // or not and tells the number of vowels in a String
    public static void main(String[] args) {
        System.out.println(vowelCount("I love my mentor"));
    }

    public static int vowelCount(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'u' ||
                    str.charAt(i) == 'o') {
                count++;
            }
        }
        return count;

    }
}
