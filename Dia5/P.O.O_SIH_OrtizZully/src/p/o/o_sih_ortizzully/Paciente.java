/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p.o.o_sih_ortizzully;

import java.time.LocalDate;

/**
 *
 * @author const
 */
public class Paciente extends Persona{
    static int contPaciente = 1;
    int id_paciente;
    String fecha_nacimiento;
    LocalDate fecha_ingreso;
    String diagnostico;
    int pabellon;
    int id_hospital;

    public Paciente( String fecha_nacimiento, LocalDate fecha_ingreso, String diagnostico, int pabellon, int id_hospital, int id_persona, String nombre_completo, String direccion) {
        super(id_persona, nombre_completo, direccion);
        this.id_paciente = contPaciente++;
        this.fecha_nacimiento = fecha_nacimiento;
        this.fecha_ingreso = fecha_ingreso;
        this.diagnostico = diagnostico;
        this.pabellon = pabellon;
        this.id_hospital = id_hospital;
        
    }

    @Override
    public String toString() {
        return "Paciente{" + "id_paciente=" + id_paciente + ", fecha_nacimiento=" + fecha_nacimiento + ", fecha_ingreso=" + fecha_ingreso + ", diagnostico=" + diagnostico + ", pabellon=" + pabellon + ", id_hospital=" + id_hospital + '}';
    }

   
    

    
    
    
}
