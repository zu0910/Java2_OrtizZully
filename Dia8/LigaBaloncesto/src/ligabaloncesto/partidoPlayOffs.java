/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ligabaloncesto;

/**
 *
 * @author Uniminuto Tibu
 */
public class partidoPlayOffs extends Partido{
    
    private String ronda;

    public partidoPlayOffs() {
    }

    public partidoPlayOffs(String ronda, String equipoLocal, String equipoVisitante, int cestasEquipoLocal, int cestaEquipoVisitante, boolean finalizado, String fechaPartido) {
        super(equipoLocal, equipoVisitante, cestasEquipoLocal, cestaEquipoVisitante, finalizado, fechaPartido);
        this.ronda = ronda;
    }

    @Override
    public boolean FinalizarPartido() {
        if (getCestasEquipoLocal() == getCestaEquipoVisitante()){
            System.out.println("El partido esta empate, debe ganar uno");
            return false;
        } else {
            boolean resul = super.FinalizarPartido();
            if (resul){
                System.out.println("El partido de playOffs ha finalizado.");
            }
            return resul;
            
        }
    }
    
    @Override
    public String ObtenerInfo() {
       return "Partido de PlayOffs - Ronda: " + ronda +
        super.ObtenerInfo();
    }
    
    
    
    
}
