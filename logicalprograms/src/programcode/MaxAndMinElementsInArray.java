package programcode;

public class MaxAndMinElementsInArray {
    public static void main(String[] args){
        // Get Minimum Element from the array
        int a[] = {50,100,40,20,60};
        int min=a[0];      //50

        for (int i=1; i<a.length; i++)
        {
            if (a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println("Minimum Element of array is: " + min);
    }
}
