/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p.o.o_sih_ortizzully;

/**
 *
 * @author const
 */
public class Personal extends Persona{
    static int contPersonal = 1;
    int id_personal;
    int id_hospital;
    int id_departamento;
    String tipo_personal;
    double salario;

    public Personal(int id_hospital, int id_departamento, String tipo_personal, double salario, int id_persona, String nombre_completo, String direccion) {
        super(id_persona, nombre_completo, direccion);
        this.id_personal = contPersonal++;
        this.id_hospital = id_hospital;
        this.id_departamento = id_departamento;
        this.tipo_personal = tipo_personal;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Personal{" + "id_personal=" + id_personal + ", id_hospital=" + id_hospital + ", id_departamento=" + id_departamento + ", tipo_personal=" + tipo_personal + ", salario=" + salario + '}';
    }

    
    
    
}
