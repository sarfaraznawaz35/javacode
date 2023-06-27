package demo1.practice.genr;

import java.util.ArrayList;

public class cwh_110_generics {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(54);
        arrayList.add(643);
        arrayList.add(245);
        int a = arrayList.get(0);
        MyGeneric<String, Integer> g1 = new MyGeneric<>(23, "MuString is the string", 45);
        String str = g1.getT1();
        Integer int1 = g1.getT2();
        System.out.println(str + " " + int1);
    }
}
