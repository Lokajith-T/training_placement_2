import java.sql.*;

class AverageMarks {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/testdb","root","password");

        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(
            "SELECT AVG(marks) FROM students");

        rs.next();
        System.out.println("Average Marks: " + rs.getDouble(1));
        con.close();
    }
}
