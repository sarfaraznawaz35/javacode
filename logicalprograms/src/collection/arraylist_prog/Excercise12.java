package collection.arraylist_prog;

import java.util.ArrayList;
import java.util.List;

public class Excercise12 {
    public static void main(String[] args){
        List<String> list_strings = new ArrayList<String>();
        list_strings.add("Red");
        list_strings.add("Green");
        list_strings.add("Orange");
        list_strings.add("White");
        list_strings.add("Black");
        System.out.println("Orignal list: " + list_strings);

        List<String> list2_strings = new ArrayList<String>();
        list2_strings.add("Red");
        list2_strings.add("Green");
        list2_strings.add("Orange");

        System.out.println(list_strings + " " + list2_strings);


    }
}
