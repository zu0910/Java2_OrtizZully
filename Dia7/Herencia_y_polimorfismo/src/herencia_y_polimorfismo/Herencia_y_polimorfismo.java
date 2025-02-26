/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia_y_polimorfismo;

/**
 *
 * @author const
 */
public class Herencia_y_polimorfismo {

    public static void main(String[] args) {
        // Ejercicio 1
        
        Vehiculo v1 = new Vehiculo ("Toyota", "Nuevo");
        
        v1.mostrarDetalles();
        
        Coche c1 = new Coche (4, "Toyota", "Nuevo");
        c1.mostrarDetalles();
        
        Motocicleta m1 = new Motocicleta ("Manubrio", "Yahama", "XTZ");
        m1.mostrarDetalles();
        
        // Ejercicio 2
        
        Empleados [] listEmpleados = new Empleados [3];
        
        listEmpleados [0] = new Empleados("Zully", 1200000);
        listEmpleados [1] = new EmpleadoFijo("Fernanda", 1200000);
        listEmpleados [2] = new EmpleadoHoras(8, "Zully", 1200000);
        
        for (Empleados i: listEmpleados){
            System.out.println("----------------------------------------");
            System.out.println("Nombre: " + i.getNombre());
            System.out.println("Bonificacion: " + i.calcularBonificacion());
            System.out.println("----------------------------------------");
        }
    }
    
}
