/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solid.dip;

/**
 *
 * @author const
 */
public class DIP {
    
}
interface Motor {
    void encender();
}

class MotorGasolina implements Motor {
    public void encender() {
        System.out.println("El motor de gasolina está encendido.");
    }
}

class MotorElectrico implements Motor {
    public void encender() {
        System.out.println("El motor eléctrico está encendido.");
    }
}

class Auto {
    private Motor motor;

    public Auto(Motor motor) {
        this.motor = motor;
    }

    public void arrancar() {
        motor.encender();
    }
}