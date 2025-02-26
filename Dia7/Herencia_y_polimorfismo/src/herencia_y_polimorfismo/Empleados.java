/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_y_polimorfismo;

/**
 *
 * @author const
 */
public class Empleados {
    
    private String nombre;
    private double salario;

    public Empleados() {
    }

    public Empleados(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double calcularBonificacion(){
        double boni = salario * 0.10;
        System.out.println("Su salario es: " + salario );
        return boni;
    }
}
