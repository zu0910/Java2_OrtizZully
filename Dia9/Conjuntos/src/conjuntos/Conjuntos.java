/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conjuntos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

/**
 *
 * @author Uniminuto Tibu
 */
public class Conjuntos {

    // Conjuntos, mapas enumeraciones y excepciones 
    // SETS:
    // Los sets son una coleccion desordenada de objetos en la que no se pueden 
    // almacenar valores duplicados.
    public static void main(String[] args) {
        
        TreeSet<String> treeSet = new TreeSet<>();
        
        // Agregar elementos al TreeSet
        treeSet.add("Manzana");
        treeSet.add("Banana");
        treeSet.add("Naranja");
        treeSet.add("Pera");
        
        // Mostrar los elementos del TreeSet
        // Los muestran en orden alfabeticos
        System.out.println("Elementos en TreeSet: " + treeSet);
        
        // Iteración en un Árbol
        // 1. Importar "Iterador" y navegar con ese iterador
        
        Iterator<String> iterator = treeSet.iterator(); 
        
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        
        System.out.println("==================================");
        
        // 2. Con un for-each
        for(String elemento:treeSet){
            System.out.println(elemento);
        }
        
        // Obtener el tamaño del conjunto 
        
        int tamano =  treeSet.size(); // Esto almacena el numero de elementos del conjunto en la variable tamaño.
        System.out.println(tamano);
        
        // Convertir el set en un String 
        
        String resultado = treeSet.toString(); // Esto almacena una representación en cadena del conjunto en la variable resultado
        System.out.println(resultado);
        

        // MAPAS 
        // los mapas son estructuras de datos que me permire guardar información en manera de 
        // asociación de ckave/valor, muy parecido a los diccionarips.
        
        Map<String, Integer> hashMap = new HashMap<>();

        // Asignar valores al mapa usando el método put()
        hashMap.put("Juan", 25);
        hashMap.put("María", 30);
        hashMap.put("Luis", 28);
        hashMap.put("Ana", 35);

        // Acceder y mostrar los valores del HashMap
        System.out.println("Edad de Juan: " + hashMap.get("Juan"));
        System.out.println("Edad de María: " + hashMap.get("María"));
        System.out.println("Edad de Luis: " + hashMap.get("Luis"));
        System.out.println("Edad de Ana: " + hashMap.get("Ana"));
        
        // Iterar entre mapa
        // 1. Importando Iterador
        
        Iterator<Map.Entry<String, Integer>> iterador2 = hashMap.entrySet().iterator();
        
        while (iterador2.hasNext()){
            Map.Entry<String, Integer> entry = iterador2.next();
            String clave = entry.getKey();
            Integer valor = entry.getValue();
            System.out.println("Nombre" + clave + ", Edad: " + valor);
        }
        
        System.out.println("====================================");
        
        // 2. Bucle for-each
        
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()){
            String clave = entry.getKey();
            Integer valor = entry.getValue();
            System.out.println("Nombre: " + clave + ", Edad: " + valor);
        }
        
        System.out.println("========================================");
        // Instanciar un enumerador
        
        Pais francia= Pais.FRANCIA;
        String nombre= francia.name();// Devuelve un String con el nombre de la constante (FRANCIA)
        System.out.println(nombre);
        System.out.println(francia.toString());// Devuelve un String con el nombre de la constante (FRANCIA)
        System.out.println(francia.ordinal()); // Devuelve un entero con la posición del enum esta declarada (1)
        System.out.println(francia.values()); // Devuelve un array que contiene todos los valores del enum
        
        // Acceder a las constantes de la enumeración
        Pais miPais = Pais.ESPANA;
        
        // Obtener informacion de pais
        
        String nombrePais = miPais.getNombre();
        String capitalPais = miPais.getCapital();
        
        //Imprimir informacion del pais
        System.out.println("País: "  + nombrePais);
        System.out.println("Capital: " + capitalPais);
        
        // Manejo de excepciones (try-catch)
    }
    
}
