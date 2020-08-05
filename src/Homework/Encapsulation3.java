package Homework;

import java.util.Scanner;

public class Encapsulation3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        String whichMember = scan.nextLine();
        int memberCount = scan.nextInt();
        Subscribe subscribe = new Subscribe(whichMember, memberCount, name);
        System.out.println(subscribe);
    }

}

class Subscribe {
    private String name;
    private WhichTypeOfMember whichTypeOfMember;
    private int memberCount, price;

    public Subscribe(String whichTypeOfMember, int memberCount, String name) {
        this.name = name;
        this.memberCount = memberCount;
        setWhichTypeOfMember(whichTypeOfMember);
        this.price *= memberCount;


    }


    public void setWhichTypeOfMember(String whichTypeOfMember) {
        String str = whichTypeOfMember.toUpperCase();
        switch (WhichTypeOfMember.valueOf(str)) {
            case GOLD:
                this.whichTypeOfMember = WhichTypeOfMember.GOLD;
                this.price = WhichTypeOfMember.GOLD.getMembership();
                break;
            case SILVER:
                this.whichTypeOfMember = WhichTypeOfMember.SILVER;
                this.price = WhichTypeOfMember.SILVER.getMembership();
                break;
            case BRONZE:
                this.whichTypeOfMember = WhichTypeOfMember.BRONZE;
                this.price = WhichTypeOfMember.BRONZE.getMembership();
                break;

        }
    }


    public String toString() {
        switch (whichTypeOfMember) {
            case GOLD:
                return "Welcome to membership " + name + ". Your membership is " + price + " dollar for month you can enjoy the videos , all homework and see you soon.";
            case SILVER:
                return "Welcome to membership " + name + ". Your membership is " + price + " dollar for month you can enjoy the videos.";
            case BRONZE:
                return "Welcome to membership " + name + ". Your membership is " + price + " dollar for month you can enjoy and all homework.";


        }
        return "Sorry you can't afford our gym!";
    }
}


enum WhichTypeOfMember {
    GOLD(50), SILVER(40), BRONZE(30);
    private int membership;

    WhichTypeOfMember(int membership) {
        this.membership = membership;

    }

    public int getMembership() {
        return membership;
    }

}
    /*There are two classes one Main and Subscribe

In the Subscribe class
Create variables private String name , whichTypeOfMember
Create variables private int memberCount , price

Variable types of name , memberCount  and whichTypeOfMember as just write-only.

Make the price as just read-only.

There are 3 type of memberShip Gold  , Silver and Bronze.

Create a toString method. And do following example.

Example:

Name is Victoria , whichTypeOfMember Gold, memberCount 2.

Gold membership count is 50 for month.

Print Welcome to membership Victoria. Your membership is 100 dollar for month you can enjoy the videos , all homework and see you soon.

Name is Rinda , whichTypeOfMember Silver, memberCount 3.

Silver membership count is 40 for month.

print Welcome to membership Rinda. Your membership is 120 dollar for month you can enjoy the videos.

Name is Steven, whichTypeOfMember Bronze , memberCount 1.

Bronze membership count is 30 for month.

print Welcome to membership Steven. Your membership is 30 dollar for month you can enjoy and all homework.


Note: Price calculation should be done in the getPrice method.

In the Main class.

Call the setter methods in the subscribe class.

While calling the setName method use variable name in line 10.

Same for whichMember and memberCount variables.

print the Subscribe Object.
*/
