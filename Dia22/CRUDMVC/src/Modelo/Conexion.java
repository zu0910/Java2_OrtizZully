
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    // Atributos de conexión a la BBDD
    
    Connection con = null; 
    
    private String URL = "jdbc:mysql://bf8ncm5hd9i9rqmzdhbx-mysql.services.clever-cloud.com:3306/bf8ncm5hd9i9rqmzdhbx";
    private String USUARIO = "un0iul0xel1na4gy";
    private String PASSWORD = "f0uniSfzckknA9MNW6xm";
    
    
    public Connection getConexion(){
        try{
            con = DriverManager.getConnection(URL, USUARIO, PASSWORD);
        }catch(SQLException e){
            System.err.println(e);
        }
        return con;
    }
}
