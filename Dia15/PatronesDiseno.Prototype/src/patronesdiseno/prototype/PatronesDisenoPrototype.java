/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patronesdiseno.prototype;

/*
PROTOTYPE
Se usa para clonar objetos sin acoplar el codigo a sus clases concretas.
Java proporcina Cloneable para esto.
 */
public class PatronesDisenoPrototype {
    
    static class Persona implements Cloneable {
        private String nombre;
        private int edad;

        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }
        
        public void mostrarInfo(){
            System.out.println("Persona: " + nombre + ", Edad: " + edad);
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone(); 
        }
        
        
    }

    
    public static void main(String[] args) {
        
        try {
            Persona p1 = new Persona("Juan", 25);
            Persona p2 = (Persona) p1.clone();
            
            p1.mostrarInfo();
            p2.mostrarInfo();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
    
}
