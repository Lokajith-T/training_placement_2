import java.sql.*;
import java.util.Scanner;

class ScannerInput {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/testdb","root","password");

        PreparedStatement ps =
            con.prepareStatement("SELECT * FROM students WHERE id=?");
        ps.setInt(1, id);

        ResultSet rs = ps.executeQuery();
        if(rs.next())
            System.out.println(rs.getString("name"));

        con.close();
    }
}
