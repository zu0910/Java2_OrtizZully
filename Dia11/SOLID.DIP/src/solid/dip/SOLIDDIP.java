/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solid.dip;

/**
 *
 * @author const
 */
public class SOLIDDIP {

    /*
    Principio de inversión de dependencias
    Depende de abstracciones, no de clases concretas"
     */
    public static void main(String[] args) {
         Motor motorGasolina = new MotorGasolina();
        Motor motorElectrico = new MotorElectrico();

        
        Auto auto1 = new Auto(motorGasolina);
        Auto auto2 = new Auto(motorElectrico);

        
        auto1.arrancar();
        auto2.arrancar();
        
        
    }
    
}
