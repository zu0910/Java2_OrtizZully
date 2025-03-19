/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc.Vista;

import java.util.List;
import java.util.Scanner;
import mvc.Modelo.Usuario;


public class UsuarioVista {
    Scanner sc = new Scanner(System.in);
    public Usuario eliminarUsuario(){
        System.out.println("Eliminar usuario");
        System.out.println("Id del usuario a eliminar");
        int id = sc.nextInt();
        return new Usuario(id);
    }
    
    public void mostrarUsuario(List<Usuario> usuarios){
        System.out.println("Lista de usuarios: ");
        for (Usuario u:usuarios){
            System.out.println(u);
        }
    }
    
    public int mostrarUsurioId(){
        System.out.println("Ingrese el Id del usuario que desees buscar: ");
        int BuscarId = sc.nextInt();
        return BuscarId;
    }
    
    public Usuario agregarUsuario(){
        System.out.println("Datos para nuevo usuario: ");
        System.out.println("Nombre: ");
        
        String nombre = sc.nextLine();
        System.out.println("Email");
        String email = sc.nextLine();
        return new Usuario(nombre,email);
    }
    
    public Usuario actualizarUsuario(){
        System.out.println("Actualizar usuario.");
        System.out.println("Id del usuario: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el nuevo nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el nuevo email: ");
        String email = sc.nextLine();
        return new Usuario(id,nombre,email);
    }
    
    
    
    
}
