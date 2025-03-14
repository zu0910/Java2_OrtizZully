/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patronesdiseno_estructurales.bridgee;

/*
BRIDGE (Puente de la 9na)
Separa una abstraccion de su implementacion para que ambas 
puedan evolucionar independientemete

Ejemplo 
diferentes formas geometricas que pueden ser dibujadas de distintas maneras ( rojo o azul)
 */
public class PatronesDiseno_EstructuralesBridgee {

    ///Interfaz para la implementacion 
    interface Color{
        void applyColor();
    }
    
    // Implementaciones concretas
    static class RedColor implements Color{
        public void applyColor(){
            System.out.println("Aplicando color rojo.");
        }
    }
    
    static class BlueColor implements Color{
        public void applyColor(){
            System.out.println("Aplicando color azul.");
        }
    }
    
    // Clase base que usa una implementacion 
    
    static abstract class Shape{
        protected Color color;
        
        public Shape(Color color){
            this.color = color;
        }
        
        abstract void draw();
    }
    
    // Subclase con una implementacion diferente 
    static class Circle extends Shape{
        public Circle(Color color){
            super(color);
        }
        
        public void draw(){
            System.out.println("Dibujando circulo");
            color.applyColor();
        }
    }
    
    //Uso del patron Bridge

        public static void main(String[] args) {
        
            Shape redCircle = new Circle(new RedColor());
            Shape blueCircle = new Circle(new RedColor());
            
            redCircle.draw();
            blueCircle.draw();
        }
    
    
    
}
