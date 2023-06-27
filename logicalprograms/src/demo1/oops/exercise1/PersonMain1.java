package demo1.oops.exercise1;

public class PersonMain1 {
    public static void main(String[] args){

        Person person1 = new Person("John", 35);
        Person person2 = new Person("Tonmoy", 32);

        System.out.println(person1.getName() + " is " + person1.getAge() + " years old");
        System.out.println(person2.getName() + " is " + person2.getAge() + " years old");

        System.out.println("----------------------After one year Updated name and age are as below -----------------------:");

        person1.setName("John Wick");
        person1.setAge(36);;

        person2.setName("Tonmoy Sarkar");
        person2.setAge(33);
        System.out.println(person1.getName() + " is " + person1.getAge() + " years old");
        System.out.println(person2.getName() + " is " + person2.getAge() + " years old");

    }
}
