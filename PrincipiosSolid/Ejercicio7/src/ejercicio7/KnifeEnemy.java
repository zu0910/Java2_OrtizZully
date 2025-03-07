/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;


public class KnifeEnemy implements Enemy{
     public void doActionStab(){
        System.out.println("Apuñalando.");
    }
    
    @Override
    public void doAction(){
        doActionStab();
    }
}
