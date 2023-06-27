package programcode;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();

        // Approach 3 - Using StringBuilder class
        StringBuilder sb1 = new StringBuilder();
        sb1.append(num);
        StringBuilder rev = sb1.reverse();
        System.out.println("Reverse Number is : " + rev);
    }
}
