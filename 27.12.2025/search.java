import java.sql.*;

class SearchById {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/testdb","root","password");

        PreparedStatement ps =
            con.prepareStatement("SELECT * FROM students WHERE id=?");
        ps.setInt(1, 2);

        ResultSet rs = ps.executeQuery();
        if(rs.next())
            System.out.println(rs.getString("name"));
        else
            System.out.println("Record not found");

        con.close();
    }
}
