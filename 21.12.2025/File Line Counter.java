import java.io.*;

class LineCount {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));
        int count = 0;
        while (br.readLine() != null) count++;
        System.out.println(count);
    }
}
