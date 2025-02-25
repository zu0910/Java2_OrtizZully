/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

public class Ejercicio1 {

    
    public static void main(String[] args) {
        Empleado emp1 = new Empleado();
        
        emp1.setSalario(-10);
        System.out.println(emp1.getSalario());
        
        emp1.setNombre("zully");
        
        
        emp1.setId(1);
        
        
        emp1.mostrarInformacion();
        
    }
    
}
