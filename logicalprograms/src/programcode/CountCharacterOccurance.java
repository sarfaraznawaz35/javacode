package programcode;

public class CountCharacterOccurance {
    public static void main(String[] args){

        String s = "Java programming Java oops";

        int totalcount = s.length();     // total length
        int totalcount_afterRemove = s.replace("a", "").length(); // total length after removing a
        int count = totalcount - totalcount_afterRemove;

        System.out.println("Number occurances of 'a' is:" + count);

    }
}
