package collection.arraylist_prog;

import java.util.ArrayList;
import java.util.List;

public class Excercise3 {
    public static void main(String[] args){
        List<String> list_strings = new ArrayList<String>();
        list_strings.add("Red");
        list_strings.add("Green");
        list_strings.add("Orange");
        list_strings.add("White");
        list_strings.add("Black");

        // print the list
        System.out.println(list_strings);

        // now insert a color at the first and last position of the list
        list_strings.add(0, "Pink");
        list_strings.add(5, "Yellow");
        System.out.println(list_strings);

    }
}
