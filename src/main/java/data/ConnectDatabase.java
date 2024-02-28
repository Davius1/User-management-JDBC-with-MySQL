package data;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

//author DAVIUS1

public class ConnectDatabase {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "admin";
    
    public static Connection getConnection() throws SQLException{
       return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
        
    }
    
    public static void close(ResultSet rs) throws SQLException{
        rs.close();       
    }
    
    public static void close(Statement smtm) throws SQLException{ //smtm es estatement (objeto de tipo statement)
       smtm.close(); 
    }
    
    public static void close(PreparedStatement smtm) throws SQLException{ //Funciona este mejor que el anterior, cosa de performance
       smtm.close(); 
    }
    
    public static void close(Connection conn) throws SQLException{
       conn.close(); 
    }
    /*YA TENEMOS NUESTRA CLASE DE CONEXIÓN QUE PODEMOS REUTILIZAR EN DIFERENTES PROYECTOS*/
}
