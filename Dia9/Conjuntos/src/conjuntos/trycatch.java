/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conjuntos;

/*
    MENEJO DE EXCEPCIONES (try-catch)
    En java, el bloque try-catch se usa para manejar excepciones, con el fin de evitar que un error 
    detenga abruptamente la ejecucion del programa.

 */
public class trycatch {
    
    public static void main(String[] args){
        try{
            int numero1 = 10;
            int numero2 = 0;
            int resultado = numero1 / numero2;
            System.out.println("El resultado es: " + resultado);
        } 
        catch (Exception e){
            System.out.println("Error: No se te olvide que no puedes dividir por cero: " + e.getMessage());
        }finally{
            System.out.println("Fin del programa ");
        }
    }
    
}
