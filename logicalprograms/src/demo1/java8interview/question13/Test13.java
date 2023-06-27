package demo1.java8interview.question13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test13 {
    public static void main(String[] args){
        List<User> users = Stream.of(new User("user1", "1234567890", Arrays.asList("abc@gmail.com", "def@gmail.com")),
                new User("user2", "0987654321", Arrays.asList("aghi@gmail.com", "jkl@gmail.com")))
        .collect(Collectors.toList());

        //I want to gather only phone of all users using "map"
        List<String> phoneNumbers = users.stream().map(User::getPhone).collect(Collectors.toList());
        System.out.println(phoneNumbers);

        List<String> lists = users.stream().flatMap(u -> u.getEmail().stream()).collect(Collectors.toList());
        System.out.println(lists);

    }

}
