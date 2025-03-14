/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexionmysql;

import java.sql.*;

public class dbConnection {
   static String url= "jdbc:mysql://localhost:3306/crud_java";
   static String user = "root";
   static String pass = "1092528097";
   
   public static Connection conectar(){
       Connection conec = null;
       try{
           conec = DriverManager.getConnection(url,user,pass);
           System.out.println("Conexión exitosa :happyface: ");
       }catch(SQLException e){
           e.printStackTrace();
       }
       return conec;
   }
}
