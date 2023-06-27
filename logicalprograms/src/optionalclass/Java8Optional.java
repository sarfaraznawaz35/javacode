package optionalclass;

import java.util.Date;
import java.util.Optional;

public class Java8Optional {
    public static void main(String[] args){

        // Three ways of Creating an optional object

        // 1. Optional.empty()
        Optional<String> myStr1 = Optional.empty();
        System.out.println(myStr1);

        // 2. Optional.of
        Optional<String> myStr2 = Optional.of("First");
        System.out.println(myStr2.get());

        // 3. Optional.ofNullable
        Optional<String> myStr3 = Optional.ofNullable("Second");
        System.out.println(myStr3);

        //.ifPresent
        myStr3.ifPresent(str -> System.out.println(str.toUpperCase()));

        // .orElse
        System.out.println(myStr1.orElse("Okay Java"));

        String country = "England";
        Optional<String> c = Optional.ofNullable(country);
        System.out.println(c.orElse("India"));

        // orElseGet
        Optional<Date> today = Optional.empty();
        System.out.println(today.orElseGet(()-> new Date()));

        // orElseThrough
        //Optional<Integer> item = Optional.empty();
        Optional<Integer> item = Optional.of(1);
        System.out.println("orElseThrough = " + item.orElseThrow(IllegalArgumentException :: new));

        // .filter()
        Optional<Integer> age = Optional.of(20);
        System.out.println(".filter = " + age.filter(n -> n>18).get());

        // map
        Optional<Integer> price = Optional.ofNullable(20);
        //System.out.println("map = " + price.map( p -> p*p));

        Optional<Integer> prc = price.map(p -> p*p);
        if (prc.isPresent()){
            System.out.println(prc.get());
        }
    }
}
