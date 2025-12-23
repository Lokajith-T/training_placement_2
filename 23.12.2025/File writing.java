import java.io.*;

public class FileWriteDemo {
    public static void main(String[] args) throws Exception {

        FileWriter fw = new FileWriter("data.txt");
        fw.write("Java File Handling Example");
        fw.close();

        System.out.println("Data written to file");
    }
}
