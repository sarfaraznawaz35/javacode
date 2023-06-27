package ConstructorReference;

public class ConsMain {
    public static void main(String[] args){
        System.out.println("Learning constructor Reference");

        // Constructor reference
        // ClassName:: new
        Provider provider = Student::new;

        Student student = provider.getStudent();
        student.display();
    }
}
