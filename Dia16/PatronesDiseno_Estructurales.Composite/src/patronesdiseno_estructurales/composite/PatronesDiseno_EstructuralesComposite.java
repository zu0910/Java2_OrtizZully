/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patronesdiseno_estructurales.composite;

import java.util.ArrayList;
import java.util.List;

/*
Composite (Compuesto Trrito Rojo)
Pérmite tratar objetos individuales y composiciones de objetos de manera uniforme 

Ejemplo: Jerarquia de Empleados
 */
public class PatronesDiseno_EstructuralesComposite {

    static abstract class Employee{
        protected String name;
        protected String position;

        public Employee(String name, String position) {
            this.name = name;
            this.position = position;
        }
        
        abstract void showDetails();
    }
    
    //Hoja
    static class Developer extends Employee{
        public Developer(String name){
            super(name, "Desarrollador");
        }
        
        @Override
        void showDetails(){
            System.out.println(position + ":" + name);
        }
    }
    
    // Compuesto 
    
    static class Manager extends Employee {
        private List<Employee> subordinates = new ArrayList<>();
        
        public Manager(String name){
            super (name, "Gerente");
        }
        
        public void addEmployee(Employee emp){
            subordinates.add(emp);
        }
        
        @Override
        void showDetails(){
            System.out.println(position + ":" + name);
            for (Employee e: subordinates){
                e.showDetails();
            }
        }
    }
    
    public static void main(String[] args) {
        Manager manager = new Manager ("Carlos");
        manager.addEmployee(new Developer ("Ana"));
        manager.addEmployee(new Developer ("Juan"));
        
        manager.showDetails();
    }
    
}
