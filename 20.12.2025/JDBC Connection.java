import java.sql.*;

class JDBCExample {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/test", "root", "password");
        System.out.println("Connected");
        con.close();
    }
}
