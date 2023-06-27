package demo1.java8interview.question16;

import java.util.stream.IntStream;

public class Test16 {
    public static void main(String[] args){

        IntStream.rangeClosed(1,10).forEach(t -> System.out.println(Thread.currentThread().getName() + t));
        System.out.println("---------------------------------------");
        IntStream.rangeClosed(1,10).parallel().forEach(t -> System.out.println(Thread.currentThread().getName() + " : " + t));

    }
}
