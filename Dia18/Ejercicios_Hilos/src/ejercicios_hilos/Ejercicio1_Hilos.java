/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_hilos;

/**
 *
 * @author Uniminuto Tibu
 */
class ContHilo extends Thread {

    public ContHilo(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i=1; i <= 5; i++){
            System.out.println(getName() + " contando: " + i);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(getName() + " fue interrumpido.");
            }
        }
        System.out.println(getName() + " ha terminado.");
    }
    
    
}

class Hilo extends Thread {
    public Hilo(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i=1; i <= 3; i++){
            System.out.println(getName() + " Mensaje # : " + i);
            try{
                Thread.sleep(1500);
            }catch (InterruptedException e){
                System.out.println(getName() + " fue interrumpido.");
            }
        }
        System.out.println(getName() + " ha terminado.");
    }
}

    

public class Ejercicio1_Hilos {

    public static void main(String[] args) {
        ContHilo hilo = new ContHilo("ContHilo ");
        hilo.start();
        
        System.out.println(" Hilo ejecutandose ");
        
        Hilo hilo1= new Hilo("Hilo-A");
        Hilo hilo2 = new Hilo("Hilo-B");
        
        hilo1.start();
        hilo2.start();
        
        System.out.println("Ambos hilos han sido iniciados");
    }
    
}