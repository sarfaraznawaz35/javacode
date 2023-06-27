package programcode;

public class RemoveJunkOrSpecialCharacter {
    public static void main(String[] args){

        String s = "**%$###@`@@*` latin string 01234567890";
        String s1 = "@#$#$@ testing #@$@#$@#$ Selenium !@#$@# &&&& Java";

        s=s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);

        s1 = s1.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s1);

    }
}
