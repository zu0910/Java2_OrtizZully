/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p.o.o_sih_ortizzully;

/**
 *
 * @author const
 */
public class Doctor extends Personal{
    static int contDoctor = 1;
    int id_doctor;
    String especialidad;
    String tipo_doctor; // Asociado o junior 
    int id_equipo_medico;

    public Doctor(int id_doctor, String especialidad, String tipo_doctor, int id_equipo_medico, int id_personal, int id_hospital, int id_departamento, String tipo_personal, double salario, int id_persona, String nombre_completo, String direccion) {
        super(id_personal, id_hospital, id_departamento, tipo_personal, salario, id_persona, nombre_completo, direccion);
        this.id_doctor = contDoctor++;
        this.especialidad = especialidad;
        this.tipo_doctor = tipo_doctor;
        this.id_equipo_medico = id_equipo_medico;
    }

    @Override
    public String toString() {
        return "Doctor{" + "id_doctor=" + id_doctor + ", especialidad=" + especialidad + ", tipo_doctor=" + tipo_doctor + ", id_equipo_medico=" + id_equipo_medico + '}';
    }
    
    
    
}
