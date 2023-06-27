package programcode;

public class FactorialNumber {
    public static void main(String[] args){
        // Approach 2 - writing logic in descending order
        // 5! = 5*4*3*2*1 = 120
        int num = 5;
        long factorial = 1;

        for(int i=num; i>=1; i-- ){
            factorial = factorial * i;
        }
        System.out.println("Factorial of a Number is: " + factorial);
    }
}
