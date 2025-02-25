/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia;

/**
 *
 * @author Uniminuto Tibu
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // HERENCIA
        /* Es un mecanismo que permite crear nuevas clases a partir de clases existentes.
        La clase que se hereda se demomina superclase o clase base, donde la nueva
        clase se conoce como subclase a clase derivada.*/
        
        // CARACTERISTICAS
        /* 1. Reutilización de codigo: Las subclases heredan atributos y metodos 
        de la superclase, evitando asi la duplicacion de codigo.
        2. Jerarquia de clases: Permite organizar y estructurar el codigo en una jerarquia logica
        3. Extensibilidad: Se pueden agregar o modificar funcionalidades en subclase 
        sin afectar la superclase. */
        
        Perro perro1 = new Perro("Lucas");
        
        perro1.hacerSonido();
        perro1.moverCola();
        
        // POLIMORFISMO
        /* El polimorfismo permite que un objeto se comporte de diferentes
        maneras segun el contexto. En java, esto se traduce en que una variable de
        un tipo de referencia (por ejemplo, la superclase) puede
        referenciar a objetos de cualquier subclase.*/
        
        
        // Creamos una variable llamada "miAnimal" de tipo "Animal", pero se le asigna 
        // un objeto de la subclase "Perro"
        
        Animal miAnimal = new Perro("Firulais"); // Tiempo de ejecucion
        // En Java una subclase es un tipo de la superclase. Dicho eso, "Perro" es un "Animal".
        
        // Aunque la variable es de tipo "Animal" se invoca el metodo sobreescrito en Perro
        // Al momento de llamar "miAnimal.hacerSonido()", el metodo que se ejecuta es el de la clase 
        // "Peroo", no el de "Animal". Esto se debe a que a pesar que la variables es de tipo "Animal",
        // el metodo sobreescrito en Perro se invoca en tiempo de ejecucion. Esto se conoce como 
        // "despacho dinámico" o "vinculacion tardia"
        
        miAnimal.hacerSonido();
        miAnimal.dormir();
        
        
        // Para acceder a metodos especificos de Perro, es necesario realizar un casting
        
        if (miAnimal instanceof Perro){
            Perro miPerro = (Perro) miAnimal;
            miPerro.moverCola();
            miPerro.dormir();
        }
    }
    
}
