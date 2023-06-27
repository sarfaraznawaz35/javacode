package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {
    public static void main(String[] args){
        List<Integer> list1 = List.of(2, 4, 50, 21, 22, 67);
        System.out.println("This is List-1: " + list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(34);
        list2.add(23);
        list2.add(78);
        System.out.println( "This is List-2: " + list2);

        List<Integer> list3 = Arrays.asList(23, 567, 12, 677, 24);
        System.out.println("This is List-3: " + list3);

        // Case-1:From list1 we want to filter all even number and want to create or add into the other list
        // Traditional way (Without stream)
        ArrayList<Integer> listEven = new ArrayList<>();
        for (int value: list1){
            if(value%2 == 0){
                listEven.add(value);
            }
        }
        System.out.println("This is Even List from list1 (traditional approach): " + listEven);

        // 2nd way Using Stream
//        Stream<Integer> strea1 = list1.stream();
//        List<Integer> newEvenList = strea1.filter(i -> i % 2 == 0).collect(Collectors.toList());
        List<Integer> newEvenList = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println("newEvenList from list1 (Using stream): " + newEvenList);

        // Case-2: We want to fetch and filter all numbers greater than 10
        List<Integer> listGreater10 = list1.stream().filter(i -> i > 10).collect(Collectors.toList());
        System.out.println("List of numbers which are greater than 10: " + listGreater10);

    }
}
