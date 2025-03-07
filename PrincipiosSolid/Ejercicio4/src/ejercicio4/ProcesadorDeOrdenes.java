/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;


public class ProcesadorDeOrdenes {

	public void procesar(Orden orden) {
            if (orden.Isvalid() && new Repositorio().grabar(orden)) {
                    NotificarPorEMail.getInstance().enviarMensajeDeConfirmacion(orden);
            }
	}
}
