import java.sql.*;

class UpdateMarks {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/testdb","root","password");

        PreparedStatement ps =
            con.prepareStatement("UPDATE students SET marks=? WHERE id=?");

        ps.setInt(1, 95);
        ps.setInt(2, 2);

        ps.executeUpdate();
        System.out.println("Updated Successfully");
        con.close();
    }
}
