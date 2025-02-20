/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_ortizzully;

import java.util.Scanner;

public class Ejercicios_OrtizZully {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingresa un numero del 1 al 45: ");
        int opc = teclado.nextInt();
        teclado.nextLine();
        
        switch(opc){
            case 1: 
                // terminado
                // 1. Escribe un programa para imprimir todos los números naturales del 1 al n.
                System.out.println("Ingrese un numero natural: ");
                int n = teclado.nextInt();
                teclado.nextLine();
                
                for ( int i = 0 ; i < n; i++ ){
                    System.out.println(i);
                }
                break;
                
            case 2:
                // terminado 
                // 2. Escribe un programa para imprimir todos los números naturales en orden inverso.
                System.out.println("Ingrese un numero natural: ");
                int num = teclado.nextInt();
                
                for ( int i = num ; i > 0 ; i-- ){
                    System.out.println(i );
                }
                break;
                
            case 3:
                // Terminado 
                
                // 3. Escribe un programa para imprimir tablas de multiplicar.
                
                System.out.println("Ingrese el numero de la tabla a imprimir: ");
                int tabla = teclado.nextInt();
                
                for(int i = 0; i <= 10; i++){
                    int multiplicar = tabla * i;
                    System.out.println(tabla + " * " + i+ " = " + multiplicar);
                }
                break;
                
            case 4: 
                // Terminado
                // 4. Escribe un programa para imprimir tablas de multiplicar en orden inverso.
                System.out.println("Ingrese el numero de la tabla a imprimir: ");
                int tabla1 = teclado.nextInt();
                
                for(int i = 10; i >= 1; i--){
                    int multiplicar1 = tabla1 * i;
                    System.out.println(tabla1 + " * " + i+ " = " + multiplicar1);
                }
                
                break;
                
            case 5:
                // Terminado
                // 5. Escribe un programa para imprimir todas las letras del alfabeto de la 'a' a la 'z'.
                System.out.println("Letras del alfabeto");
                
                for (char letra = 'a'; letra <= 'z'; letra++){
                    System.out.println(letra);
                }
                break;
                
            case 6:
                // Terminado
                // Escribe un programa para imprimir el alfabeto en orden inverso, de la 'Z' a la 'A'.
                System.out.println("Letras del alfabeto en orden inverso");
                
                for (char letra = 'z'; letra >= 'a'; letra--){
                    System.out.println(letra);
                }
                break;
                
            case 7:
                // Terminado
                // 7. Escribe un programa para imprimir todos los números pares entre 1 y 100.
                System.out.println("numeros pares entre 1 y 100: ");
                for(int i = 0; i < 100; i += 2){
                    System.out.println(i);
                }
                break;
                
            case 8:
                // Terminado
                // 8. Escribe un programa para imprimir todos los números impares entre 1 y 100.
                System.out.println("numeros impares entre 1 y 100: ");
                for(int i = 1; i < 100; i += 2){
                    System.out.println(i);
                }
                break;
                
            case 9:
                // Terminado 
                // 9. Escribe un programa para encontrar la suma de todos los números naturales entre 1 y n.
                System.out.println("Ingrese tu numero natural: ");
                int numNatural = teclado.nextInt();
                int suma = 0;
                for (int i = 1; i<= numNatural; i++){
                    suma += i;
                    System.out.println(suma);
                }
                break;
                
            case 10:
                // Terminado pero ver corregir algo 
                // 10. Escribe un programa para encontrar la suma de todos los números pares entre 1 y n.
                 System.out.println("Ingrese tu numero: ");
                int numPares = teclado.nextInt();
                int suma1 = 0;
                for (int i = 2; i<= numPares; i+= 2){
                    suma1 += i;
                    System.out.println(suma1);
                }
                break;
            case 11:
                // Termiando pero debo ver algo 
                // 11. Escribe un programa para encontrar la suma de todos los números impares entre 1 y n.
                
                 System.out.println("Ingrese tu numero: ");
                int numImpar = teclado.nextInt();
                int suma2 = 0;
                for (int i = 1; i <= numImpar; i += 2){
                    suma2 += i;
                    System.out.println(suma2);
                }
                
                break;
                
            case 12:
                // Corregir 
                
                // 12. Escribe un programa para imprimir los valores ASCII.
                System.out.println("Valores ASCII:");
                for (int i = 1; i <= 255; i++) {
                    System.out.println(i + " -> " + (char) i);
                }
                break;
                
            case 13:
                // 13. Escribe un programa para encontrar el factorial de cualquier número.
                int num1 = teclado.nextInt();
                long factorial = 1;
                for ( int i = 1; i <= num1; i++){
                    factorial *= i;
                    System.out.println(factorial);
                }
                break;
                
            case 14:
                // 14. Escribe un programa para calcular el valor de un número elevado a la potencia de otro.
                
                System.out.println("Ingresa el numero: ");
                int num2 = teclado.nextInt();
                System.out.println("ingresa el exponente del numero: ");
                int exponente = teclado.nextInt();
                
                long resultado = 1;
                
                for( int i = 1; i <= exponente; i++){
                    resultado *= num2;
                    System.out.println(resultado);
                }
                
                break;
                
            case 15:
                
                // 15. Escribe un programa para invertir los dígitos de un número dado.
                System.out.println("Ingrese un numero para invertir : ");
                int num3 = teclado.nextInt();
                
                long invertido = 0;
                
                while (num3 != 0){
                    int digito = num3 % 10;
                    invertido = invertido * 10 + digito;
                    num3 /= 10;
                    System.out.println(invertido);
                }
                
                break;
            case 16:
                
                // 16.Escribe un programa para calcular la suma de los dígitos de un número.
               
                System.out.println("Ingrese un numero: ");
                int num4 = teclado.nextInt();
                
                int suma3 = 0;
                
                while (num4 != 0){
                    int digito = num4 % 10;
                    suma3 += digito;
                    num4 /= 10;
                    System.out.println(suma3);
                }
                break;
                
            case 17:
                // 17. Escribe un programa para verificar si un número dado es primo o no.
                int verificar;
                System.out.println("Ingrese un numero: ");
                verificar = teclado.nextInt();
                
                if (verificar % 2 == 0){
                    System.out.println("El numero es primo");
                }else {
                    System.out.println("El numero no es primo");
                }
                break;
                
            case 18:
                // Terminado 
                // 18. Escribe un programa para calcular el MCD (Máximo Común Divisor) de dos números dados.
                
                System.out.println("Ingrese el primer numero: ");
                int a = teclado.nextInt();
                
                System.out.println("Ingrese el segundo numero: ");
                int b = teclado.nextInt();
                
                while (b != 0){
                    int temp = b;
                    b = a % b;
                    a = temp;
                    System.out.println(a);
                }
                
                break;
                
            case 19:
                // 19. Escribe un programa que permita ingresar números hasta que el usuario lo desee y, al final, muestre la
                //cantidad de números positivos, negativos y ceros ingresados.
                
                int positivos = 0;
                int negativos = 0; 
                int ceros = 0;
                
                while(true){
                    System.out.println("Ingresa un numero: ");
                    int nums = teclado.nextInt();
                    teclado.nextLine();
                    
                    if(nums < 0){
                        negativos ++;
                        break;
                    }
                    if(nums > 0){
                        positivos++;
                    }
                    else{
                        ceros++;
                    }
                }
                System.out.println("Numeros positivos: " + positivos);
                System.out.println("Numeros negativos: " + negativos);
                System.out.println("Numeros ceros: " + ceros);

                break;
            case 20: 
                // 20. Escribe un programa que permita ingresar números hasta que el usuario lo desee y, al final, muestre el
                // número más grande y el más pequeño ingresado.
                
                
                boolean booleanito = true;
                int maximo = Integer.MIN_VALUE;
                int minimo = Integer.MAX_VALUE;
                
                while(true){
                    System.out.println("Ingresa un numero(Si quieres terminar ingresa 0): ");
                    int numeros = teclado.nextInt();
                    
                    if(numeros == 0){
                        break;
                    }
                    if(booleanito){
                        maximo = numeros;
                        minimo = numeros;
                        booleanito = false;
                    }
                    if(numeros > maximo){
                        maximo = numeros;
                    }
                    if(numeros < minimo){
                        minimo = numeros;
                    }
                }
                
                System.out.println("El numero mayor es: " + maximo);
                System.out.println("El numero menor es: " + minimo);

                break;
            case 21:
                // 21. Escribe un programa para encontrar los números y la suma de todos los enteros entre 100 y 200 que sean
                // divisibles por 9.
                
                int suma4 = 0;
                
                System.out.println("Numeros entre 100 y 200 que son divisible por 9: ");
                
                for (int i = 100; i <= 200; i++){
                    if ( i % 9 == 0){
                        System.out.println(i);
                        suma4 += i;
                    }
                }
                System.out.println(suma4);
                
                break; 
                
            case 22:
                // 22. Escribe un programa para convertir un número binario a decimal sin usar arreglos, funciones ni bucles
                // while.
                System.out.println("Ingresa el numero binario: ");
                String bina = teclado.nextLine();
                
                int decimal = 0;
                int poten = 1;
                for( int i= bina.length() -1; i >= 0; i -- ){
                    char bi = bina.charAt(i);
                    if (bi == '1'){
                        decimal += poten;
                    }
                    poten *= 2;
                }
                System.out.println(decimal);
                
                break; 
            case 23:
                // 23. Escribe un programa para verificar si un número es un Número Fuerte o no.
                
                System.out.println("Ingrese un numero: ");
                String num5 = teclado.nextLine();
                
                int s = 0;
                
                for( int i=0; i<num5.length(); i++){
                    int sep = num5.charAt(i) - '0';
                    
                    int sumFac = 1;
                    for (int x=sep; x>0; x--){
                        sumFac = sumFac*x;
                    }
                    s += sumFac;
                }
                if (s == Integer.parseInt(num5)){
                    System.out.println(num5 + "Es un numero fuerte.");
                } else {
                    System.out.println(num5 + "No es un numero fuerte.");
                }
                
                break;
            case 24:
                // Escribe un programa para convertir un número hexadecimal a decimal.
                System.out.println("Por favor ingrese un numero hexadecimal: ");
                String hexadecimal = teclado.nextLine();
                int decimal2 = Integer.parseInt(hexadecimal, 16);
                System.out.println(decimal2);
                break;
                
            case 25:
                // 25. Escribe un programa para convertir un número hexadecimal a octal.
                
                System.out.println("Por favor ingrese un numero hexadecimal: ");
                String hexadecimal2 = teclado.nextLine();
                int decimal3 = Integer.parseInt(hexadecimal2, 16);
                String octal = Integer.toOctalString(decimal3);
                System.out.println(octal);
                break;
                
            case 26:
                
                // 26. Escribe un programa para convertir un número hexadecimal a binario.
                
                System.out.println("Por favor ingrese un numero hexadecimal: ");
                String hexadecimal3 = teclado.nextLine();
                int decimal4 = Integer.parseInt(hexadecimal3, 16);
                String binario = Integer.toOctalString(decimal4);
                System.out.println(binario);
                
                break;
            case 27:
                
                // 27. Escribe un programa para convertir un número decimal a hexadecimal.
                
                System.out.println("Por favor ingrese un numero decimal: ");
                int decimal5 = teclado.nextInt();
                String hexadecimal4 = Integer.toHexString(decimal5).toUpperCase();
                System.out.println(hexadecimal4);
                
                break;
                
            case 28:
                
                // Escribe un programa para convertir un numero decimal a octal 
                
                System.out.println("Por favor ingrese un numero decimal: ");
                int decimal6 = teclado.nextInt();
                String octal1 = Integer.toHexString(decimal6);
                System.out.println(octal1);
                
                break;
            case 29:
                
                // Escribe un programa para convertir un numero decimal a binario
                
                System.out.println("Por favor ingrese un numero decimal: ");
                int decimal7 = teclado.nextInt();
                
                StringBuilder binario1 = new StringBuilder();
                if (decimal7 == 0){
                    binario1.append("0");
                }else {
                    while (decimal7 > 0){
                        binario1.insert(0, decimal7 % 2);
                        decimal7 = decimal7 / 2;
                    }
                }
                System.out.println("El numero binario es: " + binario1.toString());
                
                break;
            case 30:
                
                // 30. Escribe un programa para convertir un número binario a octal.
                
                System.out.println("Por favor ingresa un numero binario: ");
                String binario2 = teclado.nextLine();
                int decimal8 = Integer.parseInt(binario2, 2);
                String octal2 = Integer.toOctalString(decimal8);
                System.out.println(octal2);
                
                break;
            case 31:
                // 31. Escribe un programa para convertir un número binario a decimal.
                
                System.out.println("Ingrese un numero binario: ");
                String binario4 = teclado.nextLine();
                
                int decimal10 = 0;
                int longi = binario4.length();
                
                for (int i=0; i < longi; i++){
                    char bit= binario4.charAt(longi -1 -i);
                    if (bit == '1'){
                        decimal10 += Math.pow(2, i);
                    }
                }
                System.out.println(decimal10);
                
                break;
            case 32:
                // 32. Escribe un programa para convertir un número binario a hexadecimal.
                
                System.out.println("Por favor ingresa un numero binario: ");
                String binario3 = teclado.nextLine();
                int decimal9 = Integer.parseInt(binario3, 2);
                String hexadecimal5 = Integer.toHexString(decimal9).toUpperCase();
                System.out.println(hexadecimal5);
                        
                break;
            case 33:
                
                // 33. Escribe un programa para convertir un número octal a binario.
                
                System.out.println("Por favor ingrese un numero octal: ");
                String octal3 = teclado.nextLine();
                int decimal11 = Integer.parseInt(octal3,8);
                String binario5 = Integer.toBinaryString(decimal11);
                System.out.println(binario5);
                
                break;
                
            case 34:
                
                // 34. Escribe un programa para convertir un número octal a decimal.
                
                System.out.println("Por favor ingrese un numero octal: ");
                String octal4 = teclado.nextLine();
                int decimal12 = Integer.parseInt(octal4,8);
                System.out.println(decimal12);
                
                break;
                
            case 35:
                
                // 35. Escribe un programa para convertir un número octal a hexadecimal.
                
                System.out.println("Por favor ingrese un numero octal: ");
                String octal5 = teclado.nextLine();
                int decimal13 = Integer.parseInt(octal5,8);
                String hexadecimal6 = Integer.toHexString(decimal13).toUpperCase();
                System.out.println(hexadecimal6);
                
                break;
            case 36:
                // 36. Escribe un programa para encontrar el complemento a 1 de un número en Java.
                
                System.out.println("Ingrese el numero del que quieres saber el complemento a 1");
                n = teclado.nextInt();
                teclado.nextLine();

                    System.out.println("El complemento a 1 es: "+~n);
                break;
            case 37:
                // 37. Escribe un programa para encontrar el complemento a 2 de un número binario en Java
                System.out.println("Ingresa un numero binario: ");
                String n2 = teclado.nextLine();
                int n3 = Integer.parseInt(n2, 2);
                int com2 = ~n3 +1;
                System.out.println(com2);

                break;
                
            case 38:
                //38. Escribe un programa para imprimir la serie de Fibonacci hasta n términos.
                
                System.out.println("Ingrese la cantidad de terminos de la serie de Fibonacci: ");
                
                int n1 = teclado.nextInt();
                
                int primero = 0, segundo = 1;
                
                System.out.println("Serie de Fibonacci hasta " + n1 + "Terminos: ");
                
                for (int i=0; i<n1; i++){
                    System.out.println(primero);
                    int siguiente = primero + segundo;
                    primero = segundo;
                    segundo = siguiente;
                }
                break;
            case 39:
                // 39. Escribe un programa para verificar si un número es un Número Fuerte o no.
                
                System.out.println("Ingrese un numero: ");
                String num7 = teclado.nextLine();
                
                int s1 = 0;
                
                for( int i=0; i<num7.length(); i++){
                    int sep = num7.charAt(i) - '0';
                    
                    int sumFac = 1;
                    for (int x=sep; x>0; x--){
                        sumFac = sumFac*x;
                    }
                    s1 += sumFac;
                }
                if (s1 == Integer.parseInt(num7)){
                    System.out.println(num7 + "Es un numero fuerte.");
                } else {
                    System.out.println(num7 + "No es un numero fuerte.");
                }
                
                break;
            case 40:
                // 40. Escribe un programa para imprimir todos los Números Fuertes del 1 al 100000.
                // Corregir
                System.out.println("Numeros Fuertes del 1 al 100000: ");
                
                for (int num6 = 1; num6 <= 100000; num6++){
                    int sumaFactores = 0, tem = num6;
                    
                    while(tem > 0){
                        int digito = tem % 10;
                        int factorial1 = 1;
                        
                        for (int i = 2; i<=digito; i++){
                            factorial1 *= i;
                        }
                        
                        sumaFactores += factorial1;
                        tem /= 10;
                    }
                    
                    if (sumaFactores == num6){
                        System.out.println(num6);
                    }
                }
                break;
            case 41:
                // 41. Escribe un programa para imprimir todos los Números Perfectos del 1 al 10000.
                
                System.out.println("Numeros perfectos del 1 al 10000");
                
                for (int num6 = 1; num6 <= 10000; num6++){
                    int suma5 = 0;
                    for ( int i = 1; i <= num6 / 2; i++){
                        if (num6 % 1 == 0){
                            suma5 += i;
                        }
                    }
                    if (suma5 == num6){
                        System.out.println(num6);
                    }
                }
                break;
            case 42:
                // 42. Escribe un programa para verificar si un número es un Número Perfecto o no.
                
                System.out.println("Ingrese un numero: ");
                int num8 = teclado.nextInt();
                int suma6 = 0;
                
                for (int i = 1; i <= num8 / 2; i ++){
                    if (num8 % i == 0){
                        suma6 += i;
                    }
                }
                if (suma6 == num8){
                    System.out.println(num8 + "es un numero Perfecto.");
                } else {
                    System.out.println(num8 + "No es un numero perfecto.");
                }
                break;
            case 43:
                // 43. Escribe un programa para imprimir todos los Números de Armstrong entre 1 y 1000.
                
                System.out.println("Numeros de Armstrong entre 1 y 1000");
                
                for (int num9 = 1; num9 <= 1000; num9++){
                    int temp = num9, suma7 = 0, digitos2 = String.valueOf(num9).length();
                    
                    while (temp > 0){
                        int digito1 = temp % 10;
                        suma7 += Math.pow(digito1, digitos2);
                        temp /= 10;
                    }
                    if (suma7 == num9){
                        System.out.println(num9);
                    }
                }
                break;
            case 44:
                // 44. Escribe un programa para verificar si un número es un Número de Armstrong o no.
                
                System.out.println("Ingrese un numero: ");
                int num10 = teclado.nextInt();
                
                int temp1 = num10, suma8 = 0, digitos3 = String.valueOf(num10).length();
                
                
                while (temp1 > 0){
                    int digito2 = temp1 % 10;
                    suma8 += Math.pow(digito2, digitos3);
                    temp1 /= 10;
                }
                if (suma8 == num10){
                    System.out.println(num10 + "es un numero Armstrong.");
                }else {
                    System.out.println(num10 + "No es un numero Armstrong.");
                }
                
                
                break;
            case 45:
                // 45. Escribe un programa para imprimir los factores primos en Java.
                
                System.out.println("Ingrese un numero: ");
                int num11 = teclado.nextInt();
                
                for (int i = 2; i <= num11; i++){
                    while(num11 % i == 0){
                        System.out.println(i);
                        num11 /= i;
                    }
                }
                System.out.println(num11);
                break;
            default: 
                System.out.println("Opcion invalida vuelva a intentarlo. ");
        }
    }
    
}
