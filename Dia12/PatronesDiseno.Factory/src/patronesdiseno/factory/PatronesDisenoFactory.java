/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patronesdiseno.factory;

/*
    FACTORY METHOD
    Este patron defina una interfaz para crear objetos, pero permite a los subclases decidir que 
    clase concreta instanciar. Se usa para evitar la creación directa de ibjetos con new.

 */

// Interfaz producto
interface Producto {
    void usar();
}

// Implementacion concretas

class ProductoA implements Producto{
    public void usar(){
        System.out.println("Usando producto A.");
    }
}

class ProductoB implements Producto{
    public void usar(){
        System.out.println("Usando producto B");
    }
}



public class PatronesDisenoFactory{
    // TFabrica con el metodo Factory

    class Factory {
        public static Producto crearProducto(String tipo){
            
            if (tipo.equalsIgnoreCase("A")){
                return new ProductoA();
            }else if (tipo.equalsIgnoreCase("B")){
                return new ProductoB();
            }
            throw new IllegalArgumentException("Tipo desconocido");
        }
    }

    public static void main(String[] args){
        try {
            Producto p1 = Factory.crearProducto("A");
            p1.usar();

            Producto p2 = Factory.crearProducto("B");
            p2.usar();
            
            Producto p3 = Factory.crearProducto("C");
            p3.usar();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


