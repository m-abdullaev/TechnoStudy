package YusufMentoring.May4th;

public class Student {
    String name;
    String major;
    int age;
    int firstExamGrade;
    int secondExamGrade;
    int thirdExamGrade;

    // create a method that will calculate average grade for the student.

    double getAverageGrade() {
        return (firstExamGrade + secondExamGrade + thirdExamGrade) / 3;
    }

}
