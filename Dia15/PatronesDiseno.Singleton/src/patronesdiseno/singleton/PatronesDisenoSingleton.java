/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patronesdiseno.singleton;

/*
SINGLETON
Garantiza que solo haya una instancia de una clase en todo el programa 
 
 */
public class PatronesDisenoSingleton {

    static class Singleton{                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
        private static Singleton instancia;
        
        private Singleton() {}
        
        public static Singleton getInstance() {
            if(instancia == null){
                instancia = new Singleton();
            }
            return instancia;
        }
        
        public void mostrarMensaje(){
            System.out.println("Instancia unica en Singleton");
        }
    }
    
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        
        singleton1.mostrarMensaje();
        
        System.out.println(singleton1 == singleton2);
    }
    
}
