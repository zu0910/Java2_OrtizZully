/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hilos.explicacion3;

/**
 *
 * @author Uniminuto Tibu
 */
public class PingPongSincronizado extends Thread {

    private String word;

    public PingPongSincronizado(String s) {
        word = s;
    }
    
    public void run(){
        synchronized (getClass()){ // Para entrar por aqui tenemos que conseguir el bloqueo intrinseco de la clase PingPongSincronizado
            for(int i=0; i<3000; i++){
                System.out.println(word);
                System.out.flush();
                getClass().notifyAll(); //Avisar a todos que ha terminado
                try{
                    getClass().wait();
                }catch(InterruptedException e){
                    getClass().notifyAll();
                }
            }
        }
    }
    public static void main(String[] args) {
        PingPongSincronizado p1 = new PingPongSincronizado("P");
        PingPongSincronizado p2 = new PingPongSincronizado("S");
        
        p1.start();
        p2.start();
    }
    
}
