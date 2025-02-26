/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_y_polimorfismo;

// EJERCICIO 1
public class Vehiculo {
    
    // Atributos 
    private String marca;
    private String modelo;
    
    // Constructor vacio y compuestos 
    
    public Vehiculo(){}

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
    
    public void mostrarDetalles(){
        System.out.println("---------------------");
        System.out.println("----- VEHICULOS -----");
        System.out.println("Marca:  " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("---------------------");
    }
    
}
