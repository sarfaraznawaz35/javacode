package demo1.java8interview.question14;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;

import static java.util.function.Function.*;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Test14 {
    public static void main(String[] args){

     String input = "Basant";
        Map<String, Long> countMap = Arrays.stream(input.split(""))
                .collect(groupingBy(Function.identity(), counting())
                );
        System.out.println(countMap);
    }
}
