import java.sql.*;

class ScrollResultSet {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/testdb","root","password");

        Statement stmt = con.createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE,
            ResultSet.CONCUR_READ_ONLY);

        ResultSet rs = stmt.executeQuery("SELECT * FROM students");

        rs.last();
        System.out.println("Last: " + rs.getString("name"));

        rs.first();
        System.out.println("First: " + rs.getString("name"));

        con.close();
    }
}
