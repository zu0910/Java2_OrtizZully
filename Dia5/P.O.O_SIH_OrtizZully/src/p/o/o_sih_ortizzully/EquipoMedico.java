/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p.o.o_sih_ortizzully;

/**
 *
 * @author const
 */
public class EquipoMedico {
    static int contEquipoMedico = 1;
    int id_equipo_medico;
    int id_lider;

    public EquipoMedico(int id_equipo_medico, int id_lider) {
        this.id_equipo_medico = contEquipoMedico++;
        this.id_lider = id_lider;
    }

    @Override
    public String toString() {
        return "EquipoMedico{" + "id_equipo_medico=" + id_equipo_medico + ", id_lider=" + id_lider + '}';
    }
    
}

