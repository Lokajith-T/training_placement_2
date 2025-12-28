import java.sql.*;

class TransactionExample {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/testdb","root","password");

        con.setAutoCommit(false);

        Statement stmt = con.createStatement();
        stmt.executeUpdate(
            "INSERT INTO students VALUES(3,'Arun','EEE',70)");
        stmt.executeUpdate(
            "INSERT INTO students VALUES(3,'Fail','MECH',60)");

        con.commit();
        con.close();
    }
}
