/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hilos.explicacion2;

public class Counter extends Thread{
    private int c=0;
    public synchronized void increment(){
        c++;}
    public synchronized void decrement(){
        c--;}
    
    public synchronized void run(){
        for(int i=0; i<10000; i++){
            increment();
            decrement();
        }
    }
    public synchronized int value(){return c;}
    

    
    public static void main(String[] args) {
        Counter contador = new Counter();
        Runnable tareita = () -> {
            for (int i=0; i<10000; i++){
                contador.increment();
                contador.decrement();
            }
        };
        
        Thread t1 = new Thread(tareita);
        Thread t2 = new Thread(tareita);
        
        t1.start();
        t2.start();
        
        Counter contador1 = new Counter();
        Counter contador2 = new Counter();
        
        contador1.start();
        contador2.start();
        
        System.out.println("Valor del contador final 1: " + contador1.value());
        System.out.println("Valor del contador final 2: " + contador2.value());
    }
    
}



