import java.io.*;

class FileWrite {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("test.txt");
        fw.write("Welcome to Java File Handling");
        fw.close();
        System.out.println("File written successfully");
    }
}
