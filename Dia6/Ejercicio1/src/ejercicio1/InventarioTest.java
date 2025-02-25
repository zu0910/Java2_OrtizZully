/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

public class InventarioTest {
    public static void main(String[] args){
        Producto p1 = new Producto ("cod1", "Rubor", 5, 5000);
        Producto p2 = new Producto ("cod2", "Labial", 3, 15000);
        
        p1.actualizarStock(-5);
        System.out.println(p1);
        
        
        p2.actualizarStock(5);
        System.out.println(p2);
        
        }
}
