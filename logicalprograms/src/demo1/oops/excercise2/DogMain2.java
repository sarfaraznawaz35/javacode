package demo1.oops.excercise2;

public class DogMain2 {
    public static void main(String[] args){

        Dog d1 = new Dog("Tomy", "Bull Dog" );
        Dog d2 = new Dog("Puppy", "Golden retrieval Dog");

        System.out.println(d1.getName() + " is a " + d1.getBreed());
        System.out.println(d2.getName() + " is a " + d2.getBreed());

        System.out.println("------------Setting the new breed of d1 and new name of d2 ----------: ");

        d1.setBreed("Labrador retriever Dog");
        d2.setName("Daisy");
        System.out.println(d1.getName() + " is now a " + d1.getBreed());
        System.out.println(d2.getName() + " is now a " + d2.getBreed());


    }
}
