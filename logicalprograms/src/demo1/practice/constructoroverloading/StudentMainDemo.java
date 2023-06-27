package demo1.practice.constructoroverloading;

public class StudentMainDemo {
    public static void main(String[] args){
        Student st1 = new Student();
        st1.studentId = 123;
        st1.studentName = "Ram";
        st1.studentCity = "Delhi";

        st1.study();
        st1.showFullDetails();

        Student st2 = new Student(12);
        st2.studentId = 741;
        st2.studentName = "Shyam";
        st2.studentCity = "Mumbai";
        st2.study();
        st2.showFullDetails();

        Student st3 = new Student(145, "John", "New York");
        st3.study();
        st3.showFullDetails();

    }
}
