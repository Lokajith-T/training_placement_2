import java.sql.*;

class InsertPrepared {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/testdb","root","password");

        PreparedStatement ps =
            con.prepareStatement("INSERT INTO students VALUES(?,?,?,?)");

        ps.setInt(1, 2);
        ps.setString(2, "Lokajith");
        ps.setString(3, "IT");
        ps.setInt(4, 90);

        ps.executeUpdate();
        System.out.println("Inserted Successfully");
        con.close();
    }
}
