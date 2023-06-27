package demo1.practice.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class SortExample {
    public static void main(String[] args){
        ArrayList<Emp> emps = new ArrayList<>();
        emps.add(new Emp("Durgesh", "32142153", 12));
        emps.add(new Emp("Ankit", "324", 11));
        emps.add(new Emp("Bhavesh", "977", 45));
        System.out.println(emps);
        Collections.sort(emps);
        System.out.println(emps);



    }
}
