package programcode;

import java.util.HashSet;

public class DuplicateElementsInArray {
    public static void main(String[] args){

    String arr[] = {"Java", "C", "C++", "Python", "Java"};

    //Approach 2 - By using HashSet (Note: HashSet does not contain or allow the duplicate element)
    //            And will use forEach loop(Enhanced loop)
        HashSet<String> langs = new HashSet<>();
//      <---Note: below example for understanding the feature of hashSet----
//        System.out.println(langs.add("java"));
//        System.out.println(langs.add("python"));
//        System.out.println(langs.add("java"));
//      ------------------------------------------->

        boolean flag = false;
        for (String l:arr)
        {
            if (langs.add(l)==false)
            {
                System.out.println("Found Duplicate Element: " + l);
                flag=true;
            }
        }
        if (flag==false)
        {
            System.out.println("Not found Duplicate");
        }
    }
}
