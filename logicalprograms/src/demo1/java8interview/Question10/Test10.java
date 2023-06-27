package demo1.java8interview.Question10;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test10 {

    public void printElement(int i){
        System.out.println(i);
    }

    public static void main(String[] args){
        List<Integer> list = Arrays.asList(23,4,6,8,9,1,2,10);

        // We filter all numbers which are greater then 4 and also i want to
        // maintain the ascending order sorting

        Predicate<Integer> predicate = t-> t>4;

        Test10 test = new Test10();

        list.stream().filter(t->t>4).sorted().forEach(test::printElement);


    }

}
