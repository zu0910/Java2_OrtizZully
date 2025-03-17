/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.normalito.lib;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;

public class UsuarioDAO {
    
    // Atributos de conexión a la BBDD
    
    private String URL = "jdbc:mysql://bf8ncm5hd9i9rqmzdhbx-mysql.services.clever-cloud.com:3306/bf8ncm5hd9i9rqmzdhbx";
    private String USUARIO = "un0iul0xel1na4gy";
    private String PASSWORD = "f0uniSfzckknA9MNW6xm";
    
    // Metodo para conectarnos a la BBDD
    private Connection conectar() throws SQLException{
        return DriverManager.getConnection(URL,USUARIO,PASSWORD);
    }
    
    // Creat (Insert)
    public void insertUsuario(String nombre, String email){
        String sql = "INSERT INTO usuarios (nombre,email) values (?,?)";
        try{
            Connection conexionInterna = conectar();
            PreparedStatement solicitud = conexionInterna.prepareStatement(sql);
            //Asignando valores a la incognitas
            solicitud.setString(1, nombre);
            solicitud.setString(2, email);
            // Ejecucion de la solicitud
            solicitud.executeUpdate();
            System.out.println("Usuario ingresado de manera exitosa!");
        
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    
    // Leer (SELECT)
    public List<String> obtenerUsuario(){
        String sql = "SELECT * FROM usuarios";
        List<String> ListaUsuarios = new ArrayList<>();
        try(
            Connection conexionInterna = conectar();
            PreparedStatement solicitud = conexionInterna.prepareStatement(sql);
            ResultSet resultado = solicitud.executeQuery();){
            while (resultado.next()){
                ListaUsuarios.add(resultado.getInt("id")+ " - " + resultado.getString("nombre") + " - " + resultado.getString("email"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return ListaUsuarios;
    }
    
    public void actualizarUsuario(int id, String nombre, String email){
        String sql = "UPDATE usuarios SET nombre = ?, email = ? where id= ?";
        try(Connection conexionInterna = conectar();
            PreparedStatement solicitud = conexionInterna.prepareStatement(sql)){
                // Asignando valores a las incognitas 
                solicitud.setString(1,nombre);
                solicitud.setString(2,email);
                solicitud.setInt(3,id);
                
                // Ejecucion de la solicitud
                int filas = solicitud.executeUpdate();
                if(filas > 0){
                    System.out.println("Usuario actualizado exitosamente!. ");
                }else {
                    System.out.println("No se pudo actualizar el usuario con ID " +id);
                }
            }catch (SQLException e){
            e.printStackTrace();
        }
    }
    
    // Listar persona por id 
     public void listarPersona(){
       String sql = "SELECT * FROM Persona";
       try(Connection conexionInterna = conectar();
            PreparedStatement solicitud = conexionInterna.prepareStatement(sql);
            ResultSet resultado = solicitud.executeQuery()){
           while (resultado.next()){
               System.out.println("ID: " + resultado.getInt("id") +
                       ", Nombre: " + resultado.getString("nombre") +
                       ", Email: " + resultado.getString("Email"));
           }
       } catch (SQLException ex){
           System.out.println("Lo siento no se puede mostrar las personas :(");
           ex.printStackTrace();
       }
    }
     
     // Eliminar una persona 
    
    public void EliminarPersona(int id){
        String sql = "DELETE FROM Persona WHERE id = ?";
        try(Connection conexionInterna = conectar();
            PreparedStatement solicitud = conexionInterna.prepareStatement(sql)) {
            solicitud.setInt(1, id);
            int filas = solicitud.executeUpdate();
            
            if (filas > 0){
                System.out.println("El proceso de eliminacion del usuario ha sido un exito");
            }else {
                System.out.println("Ups lo siento el id "+ id +" del usuario no se encontró.");
            }
        }catch (SQLException ex){
                System.out.println("ups error al eliminar la persona :sadface: ");
                ex.printStackTrace();
        }
    }
    
}
