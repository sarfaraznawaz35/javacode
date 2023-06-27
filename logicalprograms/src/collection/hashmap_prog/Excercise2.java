package collection.hashmap_prog;

import java.util.HashMap;

public class Excercise2 {
    public static void main(String[] args){
        HashMap<Integer, String> hashMap_map = new HashMap<Integer,String>();
        hashMap_map.put(1, "Red");
        hashMap_map.put(2, "Green");
        hashMap_map.put(3, "Black");
        hashMap_map.put(4, "White");
        hashMap_map.put(5, "Blue");
        System.out.println("Size of the hash map: " + hashMap_map.size());
    }
}
