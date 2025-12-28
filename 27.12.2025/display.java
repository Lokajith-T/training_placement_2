import java.sql.*;

class DisplayAll {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/testdb","root","password");

        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM students");

        while(rs.next()) {
            System.out.println(
                rs.getInt(1)+" "+
                rs.getString(2)+" "+
                rs.getString(3)+" "+
                rs.getInt(4));
        }
        con.close();
    }
}
