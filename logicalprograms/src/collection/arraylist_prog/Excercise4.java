package collection.arraylist_prog;

import java.util.ArrayList;
import java.util.List;

public class Excercise4 {
    public static void main(String[] args){
        List<String> list_strings = new ArrayList<String>();
        list_strings.add("Red");
        list_strings.add("Green");
        list_strings.add("Orange");
        list_strings.add("White");
        list_strings.add("Black");

        // print the list
        System.out.println(list_strings);

       // Retrive the first and third element
        String firstElement = list_strings.get(0);
        System.out.println("First element: " + firstElement);
        String thirdElement = list_strings.get(2);
        System.out.println("Third element: " + thirdElement);

    }

}
