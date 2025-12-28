import java.sql.*;

class InsertStatement {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/testdb", "root", "password");

        Statement stmt = con.createStatement();
        stmt.executeUpdate(
            "INSERT INTO students VALUES(1,'Ajay','CSE',85)");

        System.out.println("Record Inserted");
        con.close();
    }
}
