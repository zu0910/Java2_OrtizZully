/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author const
 */
public class NotificadorTransferencia {
    
    public void enviarNotificacion(Transferencia transferencia) {
        String auditor= obtenerDireccionMailAuditor();
        String mensaje= componerMensajeAviso(transferencia);
        ConexionMail conexionMail=null;
        try {
            conexionMail = abrirConexionMail();
            conexionMail.enviar(new Mail().to(auditor).withBody(mensaje));
        } finally {
            if(conexionMail!=null){
              conexionMail.cerrar();
            }
        }
    }
    private String obtenerDireccionMailAuditor() {
       return "mail-auditor";
    }
    private String componerMensajeAviso(Transferencia transferencia) {
       return "aviso-transferencia-importante";    
    }
    private ConexionMail abrirConexionMail() {
       return ConexionMail.getInstance();
    }
}

    