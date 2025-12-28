import java.sql.*;

class MetaDataExample {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/testdb","root","password");

        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM students");

        ResultSetMetaData rsmd = rs.getMetaData();
        System.out.println("Columns: " + rsmd.getColumnCount());

        con.close();
    }
}
