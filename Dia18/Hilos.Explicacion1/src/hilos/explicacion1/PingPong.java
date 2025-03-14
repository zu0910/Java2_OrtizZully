/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hilos.explicacion1;

public class PingPong extends Thread{ // Implementacion de la clase Thread, causando que se implemente Runnable
    private String word;
    public PingPong(String s){word=s;}
    
    public void run(){
        for(int i = 0; i<3000; i++){
            System.out.println(word);
            System.out.flush();// Vaciar el bufer de salida esandar y obliga a escribir los datos inmediantamente a la consola, garantizando que el usuario vea la informacion al instante, en lugar de esperar a que el bufer se llene.
        }
    }
    
}


   
    


