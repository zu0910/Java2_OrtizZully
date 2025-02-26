/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_y_polimorfismo;

/**
 *
 * @author const
 */
public class Motocicleta extends Vehiculo{
    
    private String tipoManubrio;

    public Motocicleta() {
    }

    public Motocicleta(String tipoManubrio, String marca, String modelo) {
        super(marca, modelo);
        this.tipoManubrio = tipoManubrio;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); 
        System.out.println("Tipo Manubrio: " + tipoManubrio);
    }
    
    
}
