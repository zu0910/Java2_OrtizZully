/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author Uniminuto Tibu
 */
public class Empleado {
    
    // Atributos privados
    
    private String nombre;
    private int id;
    private double salario;
    
    // constructores 
    
    public Empleado(){}

    public Empleado(String nombre, int id, double salario) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    // validacion
    public void setSalario(double salario) {
        if(salario > 0 ){
            this.salario = salario; 
        }else if (salario <= 0){
            System.out.println("La cantidad del salario debe ser positivo.");
        }
    }
    
    public void mostrarInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: "+ id);
        System.out.println("Salario: "+ salario);
    }
    
    
}
