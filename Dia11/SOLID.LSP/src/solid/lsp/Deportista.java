/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solid.lsp;

/**
 *
 * @author const
 */
public class Deportista {
    String nombre;

    public Deportista(String nombre) {
        this.nombre = nombre;
    }
    
    public void entrenar(){
        System.out.println(nombre + "está entrenando.");
    }
}

class JugadorDeBaloncesto extends Deportista {
    public JugadorDeBaloncesto(String nombre) {
        super(nombre);
    }

    public void lanzarBalon() {
        System.out.println(nombre + " lanza el balón.");
    }
}

class JugadorDeFutbol extends Deportista {
    public JugadorDeFutbol(String nombre) {
        super(nombre);
    }

    public void patearBalon() {
        System.out.println(nombre + " patea el balón.");
    }
}
    
    

