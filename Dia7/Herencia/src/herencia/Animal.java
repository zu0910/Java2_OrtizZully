/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author Uniminuto Tibu
 */
public class Animal {
    
   //Atributos
    protected String nombreCientifico;
    protected String especie;
    protected String habitat;
    protected boolean tienePelo;
    protected int cantPatas;
    
    //Constructores vacios y compuestos

    public Animal() {}

    public Animal(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }
    
    

    public Animal(String nombreCientifico, String especie, String habitat, boolean tienePelo, int cantPatas) {
        this.nombreCientifico = nombreCientifico;
        this.especie = especie;
        this.habitat = habitat;
        this.tienePelo = tienePelo;
        this.cantPatas = cantPatas;
    }
    
    //Metodo para todos los aniales
    public void hacerSonido(){
        System.out.println("El animalito hace un sonido.");
    }
    
    public void dormir(){
        System.out.println("Estoy durmiendo ");
    }
    
    
}
