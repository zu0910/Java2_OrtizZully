/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solid.isp;

/**
 *
 * @author const
 */
public class SOLIDISP {

    /*
     Principio de segregación de interfaz
    Las clases no deben verse obligadas a implementar métodos que no usan.
     */
    public static void main(String[] args) {
        
        Chef chef = new Chef();
        Camarero camarero = new Camarero();

        
        chef.cocinar();
        camarero.servirComida();
    }
    
}
