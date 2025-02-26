/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_y_polimorfismo;

/**
 *
 * @author const
 */
public class Coche extends Vehiculo {
    
    private int numeroPuertas;

    public Coche() {
    }

    public Coche(int numeroPuertas, String marca, String modelo) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }
    
    

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); // Llamar metodo en "Vehiculos"
        System.out.println("Numero de puestas: "+ numeroPuertas);
        
    }

    
    
    
    
}
