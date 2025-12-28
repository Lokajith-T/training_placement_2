import java.sql.*;

class HighestMarks {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/testdb","root","password");

        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(
            "SELECT name, marks FROM students ORDER BY marks DESC LIMIT 1");

        rs.next();
        System.out.println(rs.getString(1)+" "+rs.getInt(2));
        con.close();
    }
}
