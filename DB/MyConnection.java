package csi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyConnection {
    
    public static Connection getConnection() throws SQLException {
        
        Connection con = null;
        final String Driver = "com.mysql.cj.jdbc.Driver";
        final String DbUrl = "jdbc:mysql://localhost/hrms"; 
        final String username = "root";
        final String password = "";

        try {
            Class.forName(Driver);
            con = DriverManager.getConnection(DbUrl, username, password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, "MySQL Driver not found.", ex);
            throw new SQLException("Unable to load the MySQL JDBC driver.");
        }

        return con;
    }
}
