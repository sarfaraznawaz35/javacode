package demo1.practice.constructor;

public class Student3 {
    int id;
    String name;

    public void display(){
        System.out.println(id + " " +name);
    }

    public static void main(String[] args){
        Student3 s1 = new Student3();
        Student3 s2 = new Student3();
        s1.display();
        s2.display();
    }
}
