/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;


public class AuditTransfMonet {
    
    // Principio de responsabilidad Unica (SRP)
    // La clase AuditTransfMonet maneja tanto la validación de transferencia como la notificacion a clientes

    // AuditTransfMonet solo se encancarga de validar si la transferencia es importante 
    
    private NotificadorTransferencia notificador;

    public AuditTransfMonet(NotificadorTransferencia notificador) {
        this.notificador = notificador;
    }
    
    public void transferenciaRealizada(Transferencia transferencia){
        if(esTransferenciaImportante(transferencia)){
            notificador.enviarNotificacion(transferencia);
        }
    }
    
    
    private boolean esTransferenciaImportante(Transferencia transferencia) {
       return transferencia.importe()>50000;
    }
    
}
