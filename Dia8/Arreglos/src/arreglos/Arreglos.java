/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglos;

import java.util.Arrays;

/**
 *
 * @author Uniminuto Tibu
 */
public class Arreglos {
    // Estructura de datos
    /* Una estructura de datos es una forma organizada de almacenar, gestionar
    y manipular datos para que puedan ser utilizado de manera eficiente.*/
    
    public static void main(String[] args) {
        
        // Areglos
        // Una arreglo es una estructura de datos que posibilita la agrupacion de elementos 
        // del mismo tipo en una sola variable
        
        int[] arreglito;
        // Un arreglo se debe inicializar para que tenga un espacio de memoria.
        int[] arreglito2 = new int[5];
        arreglito2[0]=8;
        System.out.println(arreglito2[0]);
        System.out.println(arreglito2.length);
        
        for(int i = 0; i<arreglito2.length; i++){
            System.out.println(arreglito2[i]);
        }
        
        // Matrices
        // Las matrices son arreglos multidimensionales, donde en java se crrea comúnmente
        // las de dos dimensiones
        
        // Crea comunmente los dos dimensiones
        int cantFilas = 3;
        int cantCol = 2;
        int [][] matriz = new int [cantFilas] [cantCol]; // filas, columnas
        matriz [0] [0] = 1;
        matriz [0] [1] = 2;
        matriz [1] [0] = 3;
        matriz [1] [1] = 4;
        matriz [2] [0] = 5;
        matriz [2] [1] = 6;
        
       
        // Ciclo aninado
        for(int i=0; i < cantFilas; i++){
            for(int q=0; q<cantCol; q++){
                System.out.print(matriz[i] [q]+" ");
            }
            System.out.println("");
        }
    }
    
}
