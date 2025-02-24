/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p.o.o_sih_ortizzully;

/**
 *
 * @author const
 */
public class Departamento {
    static int contDepartamento = 1;
    int id_departamento;
    String nombre;
    int id_hospital;

    public Departamento(int id_departamento, String nombre, int id_hospital) {
        this.id_departamento = contDepartamento++;
        this.nombre = nombre;
        this.id_hospital = id_hospital;
    }

    @Override
    public String toString() {
        return "Departamento{" + "id_departamento=" + id_departamento + ", nombre=" + nombre + ", id_hospital=" + id_hospital + '}';
    }
    
    
}
