/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ligabaloncesto;


public class PartidoLiga extends Partido{
    private final int numeroJornada;

    public PartidoLiga(int numeroJornada, String equipoLocal, String equipoVisitante, int cestasEquipoLocal, int cestaEquipoVisitante, boolean finalizado, String fechaPartido) {
        super(equipoLocal, equipoVisitante, cestasEquipoLocal, cestaEquipoVisitante, finalizado, fechaPartido);
        this.numeroJornada = numeroJornada;
    }

    

    @Override
    public boolean FinalizarPartido() {
        boolean resul = super.FinalizarPartido();
        if (resul) {
            System.out.println("El partido liga ha finalizado");
        }
        return resul;
    }

    @Override
    public String ObtenerInfo() {
        return "Partido de Liga - Jornada " + numeroJornada +
        super.ObtenerInfo(); 
    }
    
    
    

    

    
    
}
