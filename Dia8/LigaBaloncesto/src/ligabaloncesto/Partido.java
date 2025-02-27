/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ligabaloncesto;

/**
 *
 * @author Uniminuto Tibu
 */
public class Partido {
    
    // Atributos privados
    
    private String equipoLocal;
    private String equipoVisitante;
    private int cestasEquipoLocal;
    private int cestaEquipoVisitante;
    private boolean finalizado;
    private String fechaPartido;

    public Partido() {
    }

    public Partido(String equipoLocal, String equipoVisitante, int cestasEquipoLocal, int cestaEquipoVisitante, boolean finalizado, String fechaPartido) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.cestasEquipoLocal =  cestasEquipoLocal;
        this.cestaEquipoVisitante =  cestaEquipoVisitante;
        this.finalizado =  finalizado;
        this.fechaPartido = fechaPartido;
    }

    public int getCestasEquipoLocal() {
        return cestasEquipoLocal;
    }

    public int getCestaEquipoVisitante() {
        return cestaEquipoVisitante;
    }

    
    public void RegistrarPuntosLocales(int puntosLo){
        if (finalizado == false){
            this.cestasEquipoLocal += puntosLo;
        } else {
            System.out.println("Lo siento el partido ya finalizo, no se puede registrar mas :( ");
        }
    }
    
    public void RegistrarPuntosVisitantes(int puntosVi){
        if (finalizado == false){
            this.cestaEquipoVisitante += puntosVi;
        }else{
            System.out.println("Lo siento el partido ya finalizao, no se puede registrar mas :( ");
        }
    }
    
    public String obtenerResultado(){
        return equipoLocal + " " + cestasEquipoLocal + " - " + cestaEquipoVisitante + " " + equipoVisitante;
    }
    
    public String ObtenerGanador(){
        if (cestasEquipoLocal > cestaEquipoVisitante){
            return  equipoLocal;
        } else if (cestaEquipoVisitante > cestasEquipoLocal){
            return equipoVisitante;
        } else {
            return "Empate";
        }
    }
    
    public boolean FinalizarPartido(){
        if (cestasEquipoLocal != cestaEquipoVisitante){
            finalizado = true;
            System.out.println("El partido ha finalizado con exito :JAYYY: ");
            return true;
        } else {
            System.out.println("No se puede finalizar en empate.");
            return false;
        }
    }
    
    public String obtenerEstadoPartido(){
        if (finalizado){
            return "Finalizado";
        } else {
            return "En juego";
        }
    }
    
    public String ObtenerInfo(){
        return "--------------------------------------" +
                "Equipo local: " + equipoLocal + " \n " +
                "Equipo visitante: " + equipoVisitante + " \n " +
                "Cestas del equipo local: " + cestasEquipoLocal + " \n " +
                "Cesta del equipo visitante: " + cestaEquipoVisitante + " \n " + 
                "Estado del partido: " + obtenerEstadoPartido() + " \n " +
                "Fecha de partido: " + fechaPartido;
    }
    
}
