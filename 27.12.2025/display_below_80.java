import java.sql.*;

class HighScorers {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/testdb","root","password");

        PreparedStatement ps =
            con.prepareStatement("SELECT * FROM students WHERE marks>?");
        ps.setInt(1, 80);

        ResultSet rs = ps.executeQuery();
        while(rs.next())
            System.out.println(rs.getString("name"));

        con.close();
    }
}
