/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author const
 */
public class CuentaAhorroTest {
    public static void main(String[] args){
        CuentaAhorro cuenta = new CuentaAhorro (10000, 2.5);
        
        cuenta.Depositar(50000);
        cuenta.Retirar(3000);
        
        cuenta.aplicarInteres();
        cuenta.mostrarSaldo();
        
    }
}
