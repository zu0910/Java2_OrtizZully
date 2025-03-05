/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solid.isp;

/**
 *
 * @author const
 */
public class ISP {
    
}

interface Cocinero {
    void cocinar();
}

interface Mesero {
    void servirComida();
}

class Chef implements Cocinero {
    public void cocinar() {
        System.out.println("El chef está cocinando.");
    }
}

class Camarero implements Mesero {
    public void servirComida() {
        System.out.println("El camarero está sirviendo la comida.");
    }
}
