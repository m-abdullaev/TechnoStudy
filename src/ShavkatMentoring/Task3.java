package ShavkatMentoring;


import java.util.Random;


public class Task3 {
    /*
            TASK 4

                Create byte age
               if the age is 1
               print you can crawl

               if the age is 2
               print you can talk

               if the age is 3
               print you can walk

               if the age is 4
               print you should have some vaccines

               if the age is 5
               print you can start reading

               else go to school
               DO THIS WITH SWITCH STATEMENT
                */
    public static void main(String[] args) {
        Random random = new Random();

//        int age = random.nextInt(1) + 5;

        int age = (int) (Math.random() * 1 + 5);
        System.out.println("random number " + age);

        switch (age) {
            case 1:
                System.out.println("you can crawl");
                break;
            case 2:
                System.out.println("you can talk");
                break;
            case 3:
                System.out.println("you can walk");
                break;
            case 4:
                System.out.println("you should have some vaccines");
                break;
            case 5:
                System.out.println("you can start reading");
                break;
            default:
                System.out.println("else go to school");
        }
    }
}
