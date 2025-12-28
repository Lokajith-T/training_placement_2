import java.sql.*;

class DeleteStudent {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/testdb","root","password");

        PreparedStatement ps =
            con.prepareStatement("DELETE FROM students WHERE id=?");

        ps.setInt(1, 1);
        ps.executeUpdate();

        System.out.println("Deleted Successfully");
        con.close();
    }
}
