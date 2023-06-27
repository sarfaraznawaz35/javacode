package collection.hashmap_prog;

import java.util.HashMap;

public class Excercise3 {
    public static void main(String[] args){
     //create two hash maps
        HashMap<Integer, String> hash_map1 = new HashMap<Integer, String>();
        HashMap<Integer, String> hash_map2 = new HashMap<Integer, String>();

        hash_map1.put(1, "Red");
        hash_map1.put(2, "Green");
        hash_map1.put(3, "Black");
        System.out.println("Values in First Map: " + hash_map1);

        hash_map2.put(4, "White");
        hash_map2.put(5, "Blue");
        hash_map2.put(6, "Orange");
        System.out.println("Values in Second Map: " + hash_map2);

        // put all the value of First map in Second map
        hash_map2.putAll(hash_map1);
        System.out.println("Now values in Second map: " + hash_map2);

    }
}
