package collection.hashmap_prog;

import java.util.HashMap;

public class Example5 {
    public static void main(String[] args){
        HashMap <Integer, String> hash_map = new HashMap<Integer,String>();
        hash_map.put(1, "Red");
        hash_map.put(2, "Green");
        hash_map.put(3, "Black");
        hash_map.put(4, "White");
        hash_map.put(5, "Blue");
        // check if the map is empty
        boolean result = hash_map.isEmpty();
        System.out.println("Is hash amp Empty: " + result);

        //Removing all the elements from linked map
        hash_map.clear();
        boolean result2 = hash_map.isEmpty();
        System.out.println("Is hash map empty: " + result2);
    }
}
