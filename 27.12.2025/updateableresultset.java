import java.sql.*;

class UpdateResultSet {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/testdb","root","password");

        Statement stmt = con.createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE,
            ResultSet.CONCUR_UPDATABLE);

        ResultSet rs = stmt.executeQuery("SELECT * FROM students");

        rs.next();
        rs.updateInt("marks", 99);
        rs.updateRow();

        System.out.println("Updated using ResultSet");
        con.close();
    }
}
