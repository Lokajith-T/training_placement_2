import java.sql.*;

class LoginCheck {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/testdb","root","password");

        String user = "Lokajith";
        int id = 2;

        PreparedStatement ps =
            con.prepareStatement("SELECT * FROM students WHERE id=? AND name=?");

        ps.setInt(1, id);
        ps.setString(2, user);

        ResultSet rs = ps.executeQuery();

        if(rs.next())
            System.out.println("Login Successful");
        else
            System.out.println("Invalid Login");

        con.close();
    }
}
