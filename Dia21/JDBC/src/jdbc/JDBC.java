/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbc;

import java.util.List;
import jdbc.normalito.lib.UsuarioDAO;

/*

 */
public class JDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        // Insertar usuario 
        /*usuarioDAO.insertUsuario("Pedro", "pedrogomez.campuslands@gmail.com");*/
        
        List<String> ListaUsuarios = usuarioDAO.obtenerUsuario();
        for (String usuario: ListaUsuarios){
            System.out.println(usuario);
        }
        /*
        usuarioDAO.actualizarUsuario(1, "Jaime", "jaime@campuslands.com");
        
        usuarioDAO.listarUsuario(1);*/
        //usuarioDAO.EliminarUsuario(5);
        
        
    }
    
}
