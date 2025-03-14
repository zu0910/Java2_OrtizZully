/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patronesdiseno_estructurales.adapter;

/*
ADAPTER
Convierte la interfaz de una clase en otra interfaz esperada por el cliente.
Permite que clases incopatibles trabajen juntas.

Contexto 
Supongamos que tenemos un sistema que usa Volt120
y queremos adaptarlo a un sistema moerno que sea Volt12
 */
public class PatronesDiseno_EstructuralesAdapter {
    // Interfaz esperada por el cliente
    interface Volt12{
        int getVolt12();
    }
    
    // Clase existente con una interfaz diferente
    static class Volt120{
        int getVolt120() {
            return 120;
        }
    }
    
    // Adaptador que convierte volt120 a volt12
    static class VoltAdapter implements Volt12{
        private Volt120 volt120;
        
        public VoltAdapter(Volt120 volt120){
            this.volt120 = volt120;
        }
        
        @Override
        public int getVolt12() {
            return volt120.getVolt120() / 10;
        }
        
        
    }
    public static void main(String[] args) {
        
        Volt120 oldSystem = new Volt120();
        Volt12 adaptedSystem = new VoltAdapter(oldSystem);
        System.out.println("Voltaje adaptado: " + adaptedSystem.getVolt12() + "V");
    }
    
}
