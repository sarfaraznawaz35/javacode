package collection.arraylist_prog;

import java.util.ArrayList;
import java.util.List;

public class Excercise5 {
    public static void main(String[] args){
        List<String> list_strings = new ArrayList<String>();
        list_strings.add("Red");
        list_strings.add("Green");
        list_strings.add("Orange");
        list_strings.add("White");
        list_strings.add("Black");

        // print the list
        System.out.println(list_strings);

        // update the third element with "Yellow"
        list_strings.set(2, "Yellow");
        // print the list again
        System.out.println(list_strings);

    }
}
