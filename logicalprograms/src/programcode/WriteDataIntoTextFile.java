package programcode;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {
    public static void main(String[] args) throws IOException {

        //Approach: use FileWriter and BufferedWriter
        FileWriter fw = new FileWriter("D:\\Sarfaraz\\wsproject_documents\\Testcreate123.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Selenium with java");
        bw.write("Selenium with Python");
        bw.write("Selenium with C#");

        System.out.println("Finished..!!!");
        bw.close();

    }
}
