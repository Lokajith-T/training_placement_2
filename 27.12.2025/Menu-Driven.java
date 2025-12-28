import java.sql.*;
import java.util.Scanner;

class MenuDriven {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/testdb","root","password");

        System.out.println("1.Insert 2.View");
        int ch = sc.nextInt();

        if(ch == 1) {
            PreparedStatement ps =
                con.prepareStatement("INSERT INTO students VALUES(?,?,?,?)");
            ps.setInt(1, 7);
            ps.setString(2, "MenuUser");
            ps.setString(3, "IT");
            ps.setInt(4, 88);
            ps.executeUpdate();
            System.out.println("Inserted");
        }
        else {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");
            while(rs.next())
                System.out.println(rs.getString("name"));
        }
        con.close();
    }
}
