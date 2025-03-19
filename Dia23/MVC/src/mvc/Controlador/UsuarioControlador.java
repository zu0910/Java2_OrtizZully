/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc.Controlador;

// Controlador 

import java.util.Scanner;
import mvc.Modelo.Usuario;
import mvc.Modelo.UsuarioDAO;
import mvc.Vista.UsuarioVista;

// Permite manejar los datos entre el modelo y la vista
public class UsuarioControlador {
    
    private UsuarioDAO usuarioDAO;
    private UsuarioVista usuarioVista;
    private Scanner scanner;

    public UsuarioControlador(UsuarioDAO usuarioDAO, UsuarioVista usuarioVista) {
        this.usuarioDAO = usuarioDAO;
        this.usuarioVista = usuarioVista;
        this.scanner = new Scanner(System.in);
    }
    
    public void iniciar(){
        boolean salir = true;
        while(salir == true){
            System.out.println("Menu principal");
            System.out.println("1. Crear usuario");
            System.out.println("2. Mostrar usuarios.");
            System.out.println("3. Mostrar usuario por ID.");
            System.out.println("4. Eliminar usuario.");
            System.out.println("5. Actualizar usuario.");
            System.out.println("6. Salir.");
            int opcion = scanner.nextInt();
            
            switch(opcion){
                case 1:
                    Usuario nuevoUsuario = usuarioVista.agregarUsuario();
                    usuarioDAO.insertar(nuevoUsuario);
                    System.out.println("Usuario agregado");
                    break;
                case 2:
                     usuarioVista.mostrarUsuario(usuarioDAO.obtenerUsuario());
                    break;
                case 3:
                    
                    usuarioDAO.listarUsuario(usuarioVista.mostrarUsurioId());
                    break;
                case 4:
                    Usuario eliUsuario = usuarioVista.eliminarUsuario();
                    usuarioDAO.EliminarUsuario(eliUsuario);
                    System.out.println("Usuario eliminado");
                    break;
                case 5:
                    Usuario actUsuario = usuarioVista.actualizarUsuario();
                    usuarioDAO.actualizarUsuario(actUsuario);
                    System.out.println("Usuario actualizado");
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    salir = false;
                    break;
                
            }
        }
    }
}
