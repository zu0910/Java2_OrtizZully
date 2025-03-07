/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author const
 */
public class GunEnemy implements Enemy{
    public void doActionShoot(){
        System.out.println("Disparar.");
    }
    
    @Override
    public void doAction(){
        doActionShoot();
    }
}
