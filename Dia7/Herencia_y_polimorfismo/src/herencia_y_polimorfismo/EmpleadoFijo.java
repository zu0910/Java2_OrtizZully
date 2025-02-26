/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_y_polimorfismo;

/**
 *
 * @author const
 */
public class EmpleadoFijo extends Empleados{

    public EmpleadoFijo(String nombre, double salario) {
        super(nombre, salario);
    }

    @Override
    public double calcularBonificacion() {
        double boni = getSalario() * 0.20;
        System.out.println("Su salario es de: " + getSalario());
        return boni; 
    }
    
    
    
}
