package collection.arraylist_prog;

import java.util.ArrayList;
import java.util.List;

public class Excercise2 {
    public static void main(String[] args){
        List<String> list_strings = new ArrayList<String>();
        list_strings.add("Red");
        list_strings.add("Green");
        list_strings.add("Orange");
        list_strings.add("White");
        list_strings.add("Black");

        // iterate and print the list
        for (String element : list_strings){
            System.out.println(element);
        }
    }
}
