import java.io.*;

public class FileCopy {
    public static void main(String[] args) throws Exception {
        FileInputStream fin = new FileInputStream("a.txt");
        FileOutputStream fout = new FileOutputStream("b.txt");

        int i;
        while((i = fin.read()) != -1) {
            fout.write(i);
        }

        fin.close();
        fout.close();
        System.out.println("File copied successfully");
    }
}
