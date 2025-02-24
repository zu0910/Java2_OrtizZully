/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p.o.o_sih_ortizzully;

/**
 *
 * @author const
 */
public class Persona {
    int contPersona = 1;
    int id_persona;
    String nombre_completo;
    String direccion;

    public Persona(int id_persona, String nombre_completo, String direccion) {
        this.id_persona = contPersona++;
        this.nombre_completo = nombre_completo;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" + "id_persona=" + id_persona + ", nombre_completo=" + nombre_completo + ", direccion=" + direccion + '}';
    }
    
    
            
    
}
