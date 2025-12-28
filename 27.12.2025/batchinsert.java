import java.sql.*;

class BatchInsert {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/testdb","root","password");

        PreparedStatement ps =
            con.prepareStatement("INSERT INTO students VALUES(?,?,?,?)");

        ps.setInt(1, 5);
        ps.setString(2, "Ravi");
        ps.setString(3, "CSE");
        ps.setInt(4, 80);
        ps.addBatch();

        ps.setInt(1, 6);
        ps.setString(2, "Sita");
        ps.setString(3, "ECE");
        ps.setInt(4, 85);
        ps.addBatch();

        ps.executeBatch();
        System.out.println("Batch Inserted");
        con.close();
    }
}
