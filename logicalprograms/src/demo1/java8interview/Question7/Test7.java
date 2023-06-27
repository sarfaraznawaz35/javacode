package demo1.java8interview.Question7;

import java.util.function.Function;

public class Test7 {
    public static void main(String[] args){

        Function<Integer, String> function = (t)-> "output : " + t;
        System.out.println(function.apply(88));

    }

}
