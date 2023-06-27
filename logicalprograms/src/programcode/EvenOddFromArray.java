package programcode;

public class EvenOddFromArray {
    public static void main(String[] args){
        int a[] = {1,2,3,4,5,6};

        //for-each loop (enhanced loop):

        // Extracting even numbers................
        System.out.println("Even number in array .....");
        for (int value: a){
            if (value%2==0)
                System.out.println(value);  // 2 4 6
        }

        // Extracting Odd numbers................
        System.out.println("Odd number in array .....");
        for (int value: a){
            if (value%2!=0)
                System.out.println(value);  // 2 4 6
        }
    }
}
