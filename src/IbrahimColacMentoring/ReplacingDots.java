package IbrahimColacMentoring;

public class ReplacingDots {
    public static void main(String[] args) {
        String str = ".192..92..95.255.";
        int len = str.length();
        String replaced = "";
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == '.') {
                replaced = str.replace(".", "[.]");
            }
        }
        System.out.println(replaced);
    }
}

