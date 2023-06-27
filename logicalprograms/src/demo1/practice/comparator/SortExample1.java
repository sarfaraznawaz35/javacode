package demo1.practice.comparator;

import demo1.practice.comparable.Emp;

import java.util.ArrayList;
import java.util.Collections;

public class SortExample1 {
    public static void main(String[] args){
        ArrayList<Emp1> emp1 = new ArrayList<>();
        emp1.add(new Emp1("Durgesh", "32142153", 12));
        emp1.add(new Emp1("Ankit", "324", 11));
        emp1.add(new Emp1("Bhavesh", "977", 45));
        System.out.println(emp1);

        ArrayList<Emp1> emp2 = new ArrayList<>(emp1);
        Collections.sort(emp2, new NameComparator());
        System.out.println(emp2);

    }
}
