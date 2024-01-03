import java.sql.*;

public class MyJDBC {
    static final String DB_URL = "jdbc:mysql://localhost:3306/sw_design";
    static final String USER = "root";
    static final String PASS = "admin";
    public static void main(String[] args) {
        Connection conn;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM beverage");
            if (stmt.execute("SELECT * FROM beverage")) {
                rs = stmt.getResultSet();}
            Class.forName("com.mysql.jdbc.Driver");
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ignored) {
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ignored) {
                }
            }
        }
    }
}
