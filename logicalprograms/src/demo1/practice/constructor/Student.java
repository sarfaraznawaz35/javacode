package demo1.practice.constructor;

public class Student {
    int studentId;
    String studentName;
    String studentCity;

    // Non-Parameterized constructor
    public Student(){
        System.out.println("creating object..");
    }

    public void study(){
        System.out.println(studentName + " is studying");
    }

    public void showFullDetails(){
        System.out.println("My Id is " + studentId);
        System.out.println("My name is " + studentName);
        System.out.println("My city is " + studentCity);
    }

}
