import java.sql.*;

class DeptWise {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/testdb","root","password");

        PreparedStatement ps =
            con.prepareStatement("SELECT * FROM students WHERE dept=?");

        ps.setString(1, "IT");
        ResultSet rs = ps.executeQuery();

        while(rs.next())
            System.out.println(rs.getString("name"));

        con.close();
    }
}
