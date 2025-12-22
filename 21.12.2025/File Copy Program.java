import java.io.*;

class FileCopy {
    public static void main(String[] args) throws Exception {
        FileInputStream in = new FileInputStream("a.txt");
        FileOutputStream out = new FileOutputStream("b.txt");
        int c;
        while ((c = in.read()) != -1)
            out.write(c);
        in.close();
        out.close();
    }
}
