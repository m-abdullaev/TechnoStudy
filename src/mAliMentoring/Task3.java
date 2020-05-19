package mAliMentoring;

import java.util.Scanner;

public class Task3 {

    //Task 3
    //Password Strength checker
    //The password must contain any of these characters "* \ . , $"
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter Password: ");
        String pass = input.nextLine();

        if (pass.contains("*") || pass.contains("\\") || pass.contains("*") || pass.contains(".") ||
                pass.contains(",") || pass.contains("$") && pass.length() == 8) {
            System.out.println("Ur pass is strong");
        } else
            System.out.println("Ur Pass is weak");
    }
}
