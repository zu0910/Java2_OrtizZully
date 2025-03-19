
package mvc.Modelo;


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
    
    // (Insert)
    public void insertar(Usuario usuario){
        String sql = "INSERT INTO usuarios (nombre,email) values (?,?)";
        try{
            Connection conexionInterna = conectar();
            PreparedStatement solicitud = conexionInterna.prepareStatement(sql);
            //Asignando valores a la incognitas
            solicitud.setString(1, usuario.getNombre());
            solicitud.setString(2, usuario.getEmail());
            // Ejecucion de la solicitud
            solicitud.executeUpdate();
            System.out.println("Usuario ingresado de manera exitosa!");
        
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    
    // Leer (SELECT)
    public List<Usuario> obtenerUsuario(){
        String sql = "SELECT * FROM usuarios";
        List<Usuario> ListaUsuarios = new ArrayList<>();
        try(
            Connection conexionInterna = conectar();
            PreparedStatement solicitud = conexionInterna.prepareStatement(sql);
            ResultSet rs = solicitud.executeQuery();){
            while (rs.next()){
                Usuario usu = new Usuario(rs.getInt("id" ), rs.getString("nombre"),rs.getString("email"));
                ListaUsuarios.add(usu);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return ListaUsuarios;
    }
    
    public void actualizarUsuario(Usuario usuario){
        String sql = "UPDATE usuarios SET nombre = ?, email = ? where id= ?";
        try(Connection conexionInterna = conectar();
            PreparedStatement solicitud = conexionInterna.prepareStatement(sql)){
                // Asignando valores a las incognitas 
                solicitud.setString(1,usuario.getNombre());
                solicitud.setString(2,usuario.getEmail());
                solicitud.setInt(3,usuario.getId());
                
                // Ejecucion de la solicitud
                int filas = solicitud.executeUpdate();
                if(filas > 0){
                    System.out.println("Usuario actualizado exitosamente!. ");
                }else {
                    System.out.println("No se pudo actualizar el usuario con ID " + usuario.getId());
                }
            }catch (SQLException e){
            e.printStackTrace();
        }
    }
    
    // Listar persona por id 
     public void listarUsuario(int id){
       String sql = "SELECT * FROM usuarios WHERE id=?";
       try (Connection conexionInterna = conectar();
            PreparedStatement solicitud = conexionInterna.prepareStatement(sql)){
            solicitud.setInt(1, id);
            ResultSet resultado = solicitud.executeQuery();
           if (resultado.next()){
               System.out.println("ID: " + resultado.getInt("id") +
                       ", Nombre: " + resultado.getString("nombre") +
                       ", Email: " + resultado.getString("Email"));
           }
       } catch (SQLException ex){
           System.out.println("Lo siento no se puede mostrar el usuario :(");
           ex.printStackTrace();
       }
    }
     
     // Eliminar una persona 
    
    public void EliminarUsuario(Usuario usuario){
        String sql = "DELETE FROM usuarios WHERE id = ?";
        try(Connection conexionInterna = conectar();
            PreparedStatement solicitud = conexionInterna.prepareStatement(sql)) {
            solicitud.setInt(1, usuario.getId());
            int filas = solicitud.executeUpdate();
            
            if (filas > 0){
                System.out.println("El proceso de eliminacion del usuario ha sido un exito");
            }else {
                System.out.println("Ups lo siento el id "+ usuario.getId() +" del usuario no se encontró.");
            }
        }catch (SQLException ex){
                System.out.println("ups error al eliminar el usuario :sadface: ");
                ex.printStackTrace();
        }
    }
}
