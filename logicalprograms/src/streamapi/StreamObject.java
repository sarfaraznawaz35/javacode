package streamapi;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args){

        // 1- blank stream with the help of .empty()
        Stream<Object> emptyStream = Stream.empty();

        // 2 - array, object, collection
        String names[] = {"Durgesh", "Uttam", "Aniket", "Divya"};
        Stream<String> stream1 = Stream.of(names);
        stream1.forEach(e->{
            System.out.println(e);
        });

        // 3 - we can create stream object using Builder Pattern
        Stream<Object> streamBuild = Stream.builder().build();

        // 4 - we can create stream object by using Arrays.stream method
        System.out.println("---------create stream object by using Arrays.stream----------");
        IntStream stream4 = Arrays.stream(new int[]{2, 4, 65, 3, 564});
        stream4.forEach(e->{
            System.out.println(e);
        });

    }
}
