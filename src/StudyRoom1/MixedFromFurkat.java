package StudyRoom1;


import java.util.Scanner;

public class MixedFromFurkat {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = scan.next();
        System.out.println("Enter your Last name");
        String lastName = scan.next();
        String fullName = name + " " + lastName;
        System.out.println("Full name is : " + fullName);

        //Defining initials with charAt method.

        char firstNameInitial = name.charAt(0);
        char lastNameInitial = lastName.charAt(0);
        System.out.println("Initials with Char method are : " + firstNameInitial + "." + lastNameInitial + ".");

        //Defining coordination of first letters in the First and Last Names with indexOf method

        int FirstNameIndex = fullName.indexOf(firstNameInitial);
        System.out.println("index of first Name initial is " + FirstNameIndex);
        int LastNameIndex = fullName.indexOf(lastNameInitial);
        System.out.println("index of Last Name initial is " + LastNameIndex);


        System.out.println("coordinate for first letter in Name is " + FirstNameIndex + "," + (FirstNameIndex + 1));
        System.out.println("coordinate for first letter in Last Name is " + LastNameIndex + "," + (LastNameIndex + 1));

        // Defining initials with substring method

        System.out.println("Initials are : " + fullName.substring(FirstNameIndex, (FirstNameIndex + 1))
                + "." + fullName.substring(LastNameIndex, (LastNameIndex + 1)) + ".");
    }

}
