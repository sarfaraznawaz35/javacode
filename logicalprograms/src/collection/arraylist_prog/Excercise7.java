package collection.arraylist_prog;

import java.util.ArrayList;
import java.util.List;

public class Excercise7 {
    public static void main(String[] args){
        List<String> list_strings = new ArrayList<String>();
        list_strings.add("Red");
        list_strings.add("Green");
        list_strings.add("Orange");
        list_strings.add("White");
        list_strings.add("Black");

        //search the value Red
        if (list_strings.contains("Red")){
            System.out.println("Found the element");
        }else {
            System.out.println("There is no such element");
        }
    }
}
