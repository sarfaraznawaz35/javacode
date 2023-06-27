package programcode;

public class ReverseString {
    public static void main(String[] args){

        //1) Using + (string concatenation) operator

        String str = "ABCD";
        String rev = "";

        int len = str.length(); //4
        for (int i=len-1; i>=0; i--){
            rev = rev+str.charAt(i);    //DCBA
        }
        System.out.println("Reversed string is:" + rev);
    }
}
