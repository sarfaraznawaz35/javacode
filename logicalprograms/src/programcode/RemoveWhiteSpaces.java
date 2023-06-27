package programcode;

public class RemoveWhiteSpaces {
    public static void main(String[] args){

        String str = "Java      programming   selenium    automation";
        System.out.println("Before removing the white spaces:" + str);
        str = str.replaceAll("\\s", "");
        System.out.println("Before removing the white spaces:" + str);
    }
}
