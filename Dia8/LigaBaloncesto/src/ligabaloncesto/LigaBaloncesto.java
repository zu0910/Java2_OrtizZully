/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ligabaloncesto;


import java.util.ArrayList;
import java.util.Scanner;

public class LigaBaloncesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        ArrayList<Partido> listaPartido = new ArrayList<>();
        
        boolean salir = false;
        
        while(salir == false){
            System.out.println("-------------------- MENU PRINCIPAL ----------------");
            System.out.println("1). Registrar partido de liga");
            System.out.println("2). Registrar partido PlayOffs");
            System.out.println("3). Registrar puntos");
            System.out.println("4). Finalizar partido.");
            System.out.println("5). Mostrar información del partido");
            System.out.println("6). Mostrar ganador.");
            System.out.println("7). Salir.");
            System.out.println("----------------------------------------------------");

            System.out.println("Ingrese una opción: ");
            int opc = teclado.nextInt();
            teclado.nextLine();
            
            switch (opc){
                case 1:
                    System.out.println("---------- REGISTRO PARTIDO DE LIGA -----------");
                    System.out.println("Equipo Local: ");
                    String localLiga = teclado.nextLine();
                    
                    System.out.println("Equipo visitante: ");
                    String visiLiga = teclado.nextLine();
                    
                    System.out.println("Fecha (YYYY-MM-DD): ");
                    String fechaLiga = teclado.nextLine();
                    
                    System.out.println("Numero de jornada: ");
                    int jornada = teclado.nextInt();
                    
                    Partido nuevoPartido = new PartidoLiga( jornada, localLiga, visiLiga, 0, 0, false, fechaLiga);
                    listaPartido.add(nuevoPartido);
                    System.out.println("Partido de Liga registrado y está en juego.");
                    break;
                    
                case 2:
                    
                    System.out.println("--------- REGISTRO PARTIDO DE PLAYOFFS ---------");
                    
                    System.out.println("Equipo Local: ");
                    String localPlay = teclado.nextLine();
                    
                    System.out.println("Equipo visitante: ");
                    String visiPlay = teclado.nextLine();
                    
                    System.out.println("Fecha (YYYY-MM-DD): ");
                    String fechaPlay = teclado.nextLine();
                    
                    System.out.println("Ronda (Octavos, Cuartos, Final) ");
                    String ronda = teclado.nextLine();
                    
                    Partido nuevoPlay  = new partidoPlayOffs(ronda, localPlay, visiPlay, 0, 0, false, fechaPlay);
                    listaPartido.add(nuevoPlay);
                    System.out.println("Partido de PlayOffs registrado y está en juego.");
                    
                    break;
                    
                case 3:
                    
                    if (!listaPartido.isEmpty()){
                        System.out.println("Sleccione el partido (indice): ");
                        for (int i = 0; i < listaPartido.size(); i++){
                            System.out.println(i + "). " + listaPartido.get(i).ObtenerInfo());
                        }
                        int index = teclado.nextInt();
                        
                        if(index >= 0 && index < listaPartido.size()){
                            Partido partido = listaPartido.get(index);
                            System.out.println("Ingrese los puntos del Equipo local: ");
                            int puntosLocal = teclado.nextInt();
                            partido.RegistrarPuntosLocales(puntosLocal);
                            
                            System.out.println("Ingrese los puntos del Equipo visitante: ");
                            int puntosVisitante = teclado.nextInt();
                            partido.RegistrarPuntosVisitantes(puntosVisitante);
                        } else {
                            System.out.println("Lo siento el indice que ingresaste no es valido");
                        }
                    } else{
                        System.out.println("Lo siento no hay equipos registrados");
                    }
                    
                    break;
                case 4:
                    
                    if (!listaPartido.isEmpty()){
                        System.out.println("Seleccione el equipo a finalizar: ");
                        for( int i=0; i < listaPartido.size(); i++){
                            System.out.println(i + ")." + listaPartido.get(i).ObtenerInfo());
                        }
                        
                        int index2 = teclado.nextInt();
                        teclado.nextLine();
                        
                        if (index2 >= 0 && index2 < listaPartido.size()){
                            listaPartido.get(index2).FinalizarPartido();
                        } else {
                            System.out.println("El indice es invalido");
                        }
                    }else{
                        System.out.println("Lo siento no hay equipos registrados");
                    }
                    break;
                    
                case 5:
                    
                    if(!listaPartido.isEmpty()){
                        for (Partido p : listaPartido){
                            System.out.println(p.ObtenerInfo());
                        }
                    }else{
                        System.out.println("No hay ningun equipo registradp");
                    }
                    break;
                    
                case 6:
                    
                    if(!listaPartido.isEmpty()){
                        for (Partido p : listaPartido){
                            System.out.println("Ganador del partido: " + p.ObtenerGanador() );
                        }
                    }else{
                        System.out.println("No hay ningun equipo registradp");
                    }
                    
                    break;
                case 7:
                    System.out.println("Finalizando programa...");
                    salir = true;
                    break;
            }
        }
        
        
    }
    
}
