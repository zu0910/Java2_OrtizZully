/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solid.lsp;

/**
 *
 * @author const
 */
public class SOLIDLSP {

    /*
    Principio de sustitución de Liskov
      establece que los objetos de una clase derivada deben poder ser sustituidos 
      por objetos de su clase base sin afectar el correcto funcionamiento del programa.
      En otras palabras, las subclases deben ser capaces de mantener las propiedades
      y comportamientos de la clase padre
    Si una clase hija hereda de una clase padre, debe poder reemplazarla sin que el programa falle.


     */
    public static void main(String[] args) {
        Deportista jugador1 = new JugadorDeBaloncesto("Michael Jordan");
        Deportista jugador2 = new JugadorDeFutbol("Cristiano Ronaldo");

        // Ambos pueden entrenar porque es común a todos los deportistas
        jugador1.entrenar();
        jugador2.entrenar();

        // Pero cada uno tiene sus propias acciones específicas
        ((JugadorDeBaloncesto) jugador1).lanzarBalon();
        ((JugadorDeFutbol) jugador2).patearBalon();
    }
    
}
