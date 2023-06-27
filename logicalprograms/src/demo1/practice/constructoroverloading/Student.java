package demo1.practice.constructoroverloading;

public class Student {

    int studentId;
    String studentName;
    String studentCity;

    public Student(){
        this(96);
        System.out.println("creating object: Non-parameterized constructor");
        System.out.println(this.studentCity);
    }

    public Student(int st){
        System.out.println("Parameterized constructor: (int)");
    }

    public Student(int i, String n, String c){
        studentId = i;
        studentName = n;
        studentCity = c;
        System.out.println("constructor with three parameters");
    }

    public void study(){
        System.out.println(studentName + " is studying");
    }

    public void showFullDetails(){
        System.out.println("My id is: " + studentId);
        System.out.println("My name is: " + studentName);
        System.out.println("My city is: " + studentCity);
    }
}
