
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private String username = "root";
    private String password = "";
    private static DBConnection dbInstance;
    private Connection conn;

    private DBConnection() {
        String jdbcUrl = "jdbc:mysql://localhost:3306/mydb";        
        
        try {
            conn = DriverManager.getConnection(jdbcUrl, username, password);            
        } catch (SQLException ex) {
            System.err.println("Gagal koneksi ke database");
        }
    }    
    
    public Connection getConnection() {                
        return this.conn;
    }
    
    public static DBConnection getInstance() {
        if (dbInstance == null) {
            dbInstance = new DBConnection();            
        }
        return dbInstance;
    }
}
