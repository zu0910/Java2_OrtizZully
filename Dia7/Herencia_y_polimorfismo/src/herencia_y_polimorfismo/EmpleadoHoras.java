/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_y_polimorfismo;

/**
 *
 * @author const
 */
public class EmpleadoHoras extends Empleados{
    
    private int horasTrabajadas;

    public EmpleadoHoras() {
    }

    public EmpleadoHoras(int horasTrabajadas, String nombre, double salario) {
        super(nombre, salario);
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularBonificacion() {
        int totalHoras = horasTrabajadas * 25000;
        double boni = getSalario() * 0.10 + totalHoras;
        return boni;
    }
    
    

    
    
    
}
