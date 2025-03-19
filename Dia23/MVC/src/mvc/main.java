/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc;

import mvc.Controlador.UsuarioControlador;
import mvc.Modelo.UsuarioDAO;
import mvc.Vista.UsuarioVista;


public class main {
    public static void main(String[] args) {
        UsuarioDAO usuarioDao = new UsuarioDAO();
        UsuarioVista usuarioVista = new UsuarioVista();
        UsuarioControlador usuarioControlador = new UsuarioControlador(usuarioDao, usuarioVista);
        
        usuarioControlador.iniciar();
    }
}
