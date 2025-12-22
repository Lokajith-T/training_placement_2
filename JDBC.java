import java.sql.*;

public class JdbcInsert {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/testdb", "root", "password");

        PreparedStatement ps =
            con.prepareStatement("INSERT INTO student VALUES (?, ?)");

        ps.setInt(1, 1);
        ps.setString(2, "Lokajith");

        ps.executeUpdate();
        System.out.println("Record inserted");

        con.close();
    }
}
