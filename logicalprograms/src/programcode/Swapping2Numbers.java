package programcode;

public class Swapping2Numbers {

    public static void main(String[] args){

        int a=10, b=20;
        System.out.println("Before swapping values are.." + a + " "+b);

        // Logic5 - Single Statement
        b=a+b - (a=b);

        System.out.println("After swapping values are.." + a + " "+b);

    }
}
