/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p.o.o_sih_ortizzully;

/**
 *
 * @author const
 */
public class Hospital {
    static int contHospital = 1;
    int id_hospital;
    String nombre;
    String direccion;
    int capacidad;
    int id_pabellon;

    public Hospital(int id_hospital, String nombre, String direccion, int capacidad, int id_pabellon) {
        this.id_hospital = contHospital++;
        this.nombre = nombre;
        this.direccion = direccion;
        this.capacidad = capacidad;
        this.id_pabellon = id_pabellon;
    }

    @Override
    public String toString() {
        return "Hospital{" + "id_hospital=" + id_hospital + ", nombre=" + nombre + ", direccion=" + direccion + ", capacidad=" + capacidad + ", id_pabellon=" + id_pabellon + '}';
    }
    
    
}
