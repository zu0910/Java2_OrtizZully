
package conexionmysql;

import java.sql.*;

public class CRUD {
    
    
    // Crear una person
   public void crearPersona ( String nombre, String correo){
       String query = "INSERT INTO Persona (nombre, correo) values (?,?) ";
       
       try {
           Connection conec = dbConnection.conectar();
           PreparedStatement ps = conec.prepareStatement(query);
           ps.setString(1, nombre);
           ps.setString(2, correo);
           
           ps.executeUpdate();
            System.out.println("La persona fue agregada con exito.");
       } catch(SQLException ex){
           System.out.println("Error al insertar la persona :sadfaces:");
           ex.printStackTrace();
       }
   }
   
   // Leer todas las personas
   
    public void listarPersona(){
       String query = "SELECT * FROM Persona";
       try(Connection conec = dbConnection.conectar();
            PreparedStatement ps = conec.prepareStatement(query);
            ResultSet rs = ps.executeQuery()){
           while (rs.next()){
               System.out.println("ID: " + rs.getInt("id") +
                       ", Nombre: " + rs.getString("nombre") +
                       ", Correo: " + rs.getString("correo"));
           }
       } catch (SQLException ex){
           System.out.println("Lo siento no se puede mostrar las personas :(");
           ex.printStackTrace();
       }
    }
    
    // Actualizar una persona 
    
    public void ActualizarPersona(int id, String nombre, String correo){
        String query = "UPDATE Persona SET nombre = ?, correo = ? WHERE id = ?";
        try (Connection conec = dbConnection.conectar();
            PreparedStatement ps = conec.prepareStatement(query)){
            
            ps.setString(1,nombre);
            ps.setString(2,correo);
            ps.setInt(3,id);
            int filas = ps.executeUpdate();
            
            if (filas > 0 ){
                System.out.println("La persona ha sido actualizasa :happyface:");
            } else {
                System.out.println("Lo siento este id " + id + "no se encontro de la persona.");
            }
        }catch (SQLException ex){
           System.out.println("ups error al actualizar la persona :sadface: ");
           ex.printStackTrace();
       }
    }
    
    // Eliminar una persona 
    
    public void EliminarPersona(int id){
        String query = "DELETE FROM Persona WHERE id = ?";
        try(Connection conec = dbConnection.conectar();
            PreparedStatement ps = conec.prepareStatement(query)) {
            ps.setInt(1, id);
            int filas = ps.executeUpdate();
            
            if (filas > 0){
                System.out.println("El proceso de eliminacion de la persona ha sido un exito");
            }else {
                System.out.println("Ups lo siento el id "+ id +" de la persona no se encontró.");
            }
        }catch (SQLException ex){
                System.out.println("ups error al eliminar la persona :sadface: ");
                ex.printStackTrace();
        }
    }
}
