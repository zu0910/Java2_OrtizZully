/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;


import java.util.ArrayList;
import java.util.List;

public class NotificarPorEMail implements NotificacionConfirmacion{

    @Override
    public void enviarMensajeDeConfirmacion(Orden orden) {
         
    }
    

    private static NotificarPorEMail instance;

    private NotificarPorEMail() {
    }

    public static NotificarPorEMail getInstance() {
            if (instance == null) {
                    instance = new NotificarPorEMail();
            }
            return instance;
    }

    public List<Orden> ordenes = new ArrayList<Orden>();
    
    
}

