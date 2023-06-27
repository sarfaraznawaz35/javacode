package programcode;

import java.io.*;
import java.util.Scanner;

public class ReadDataFromTextFile {
    public static void main(String[] args) throws FileNotFoundException {

        // Approach3:
        File file = new File("D:\\Sarfaraz\\wsproject_documents\\javatest.txt");
        Scanner sc = new Scanner(file);

        sc.useDelimiter("\\Z");
        System.out.println(sc.next());

    }
}
