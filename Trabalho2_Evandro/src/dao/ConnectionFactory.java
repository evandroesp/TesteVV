package dao;

import java.sql.*;

/**
 *
 * @author silviacb
 * @editado 0047171
 */
public class ConnectionFactory {
    public Connection getConnection() throws ClassNotFoundException, SQLException{
           Class.forName("com.mysql.jdbc.Driver");
           String urlBD="jdbc:mysql://localhost:3306/vv_final";
           return DriverManager.getConnection(urlBD, "root", "");
    }
}
