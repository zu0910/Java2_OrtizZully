/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilos.explicacion1;

/**
 *
 * @author Uniminuto Tibu
 */
public class main {
    public static void main(String[] args){
        //Ejemplo de PingPong
        Thread t1 = new PingPong("P");
        Thread t2 = new PingPong("S");
        t1.start();
        t2.start();
    }
}
