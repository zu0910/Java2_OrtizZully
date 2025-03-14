/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patronesdiseno.pkgabstract;

/*
    ABSTRACT FACTORY
    Familias de objetos relacionados sin especificar sus clase concretas.
    Se usa cuando hay multiples variantes de productos 
     */

// Interfaces de productos 

interface Boton {
    void render();
}

interface Ventana  {
    void abrir();
}

// interfaz para la fabrica abstracta 

interface GUIFactory {
    Boton crearBoton();
    Ventana crearVentana();
}

public class PatronesDisenoAbstract {
    // Implementaciones concretas para Windowa
    class BotonWindows implements Boton {
        public void render(){
            System.out.println("Renderizando boton estilo Windows.");
        }
    }
    class VentanaWindows implements Ventana {
        public void abrir(){
            System.out.println("Abriendo ventana estilo Windows.");
        }
    }
    
    // Implementacion concretas para Mac
    
    class BotonMac implements Boton {
        public void render() {
            System.out.println("Renderizando boton estilo Mac.");
        }
    }
     class VentanaMac implements Ventana {
        public void abrir(){
            System.out.println("Abriendo ventana estilo Mac.");
        }
    }
    
}
