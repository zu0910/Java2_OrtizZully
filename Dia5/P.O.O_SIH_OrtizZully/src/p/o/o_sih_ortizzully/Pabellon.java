/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p.o.o_sih_ortizzully;

/**
 *
 * @author const
 */
public class Pabellon {
    static int contPabellon = 1;
    int id_pabellon;
    String nombre;
    int capacidad;

    public Pabellon(int id_pabellon, String nombre, int capacidad) {
        this.id_pabellon = contPabellon++;
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Pabellon{" + "id_pabellon=" + id_pabellon + ", nombre=" + nombre + ", capacidad=" + capacidad + '}';
    }
    
    
}
