import java.sql.*;

class CountRecords {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/testdb","root","password");

        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(
            "SELECT COUNT(*) FROM students");

        rs.next();
        System.out.println("Total Students: " + rs.getInt(1));
        con.close();
    }
}
