package YusufMentoring;

public class Apr15Task3Vowels {
    //Task 3
    //Find how many vowels there are in a string using method
    public static void main(String[] args) {
        checkVowel("Michael Jackson");
    }

    public static void checkVowel(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println("There are " + count + " vowels in your string.");
    }

}
