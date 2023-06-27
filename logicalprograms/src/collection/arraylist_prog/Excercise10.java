package collection.arraylist_prog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Excercise10 {
    public static void main(String[] args){
        List<String> list_strings = new ArrayList<String>();
        list_strings.add("Red");
        list_strings.add("Green");
        list_strings.add("Orange");
        list_strings.add("White");
        list_strings.add("Black");
        System.out.println("List before shuffling: " + list_strings);
        Collections.shuffle(list_strings);
        System.out.println("List after shuffling: " + list_strings);

    }
}
