package YusufMentoring.Apr29.TasksClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task1 {
    //Task 1
    //Create a class named Employee in a different file. Employee will have an first name, last name, id number, password
    //Create a method in your class which will create new employee and store them in new variables in your class

    //Task 2
    //Create 5 employees with the method you created before.
    //Create a method which prints out all the people's names and id's.
    //use for loop for efficient code

    //Task 3
    //Write a code in main method that will look up the employees information and
    //print them by just putting their id number
    //Hint: use Scanner to get ID and use list to store them.


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Employee yusuf = createNewEmp("Yusuf", "Esen", 80808, "qwerty");
        Employee dos = createNewEmp("Dos", "Mukhamedov", 565660, "yo");
        Employee ali = createNewEmp("Ali", "Koklu", 707070, "what's up dude");
        Employee fetih = createNewEmp("Fetih", "Muhammet", 825782, "lolpop");
        Employee katerina = createNewEmp("Katerina", "Stepanova", 38294382, "cool");

        ArrayList<Employee> list = new ArrayList<>();
        Collections.addAll(list, yusuf, dos, fetih, katerina, ali);
//        list.add(yusuf);
//        list.add(dos);

        System.out.println("Please enter ID number: ");
        int id = scan.nextInt();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).idNum == id) {
                System.out.println(list.get(i).firstName + " " + list.get(i).lastName + " " +
                        list.get(i).password);
            }

        }


//        printInfo(ali);


    }

    public static Employee createNewEmp(String fName, String lName, int id, String pw) {
        Employee newEmp = new Employee();
        newEmp.firstName = fName;
        newEmp.lastName = lName;
        newEmp.idNum = id;
        newEmp.password = pw;

        return newEmp;
    }

    public static void printInfo(Employee emp) {
        System.out.println(emp.firstName + " " + emp.idNum);
    }
}
