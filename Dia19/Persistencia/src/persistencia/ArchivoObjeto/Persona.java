/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia.ArchivoObjeto;

/**
 *
 * @author Uniminuto Tibu
 */
public class Persona {
    private int id;
    private String nombre;
    private int edad;

    public Persona(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return id + "," + nombre + "," + edad;
    }
    
    public static Persona fromString(String String){
        String[] parts = String.split(",");
        return new Persona(Integer.parseInt(parts[0]) , parts[1], Integer.parseInt(parts[2]));
    }
    
    
    
}
