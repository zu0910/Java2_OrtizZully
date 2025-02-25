/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;


public class CuentaBancaria {
    
   
    private double saldo;

    public CuentaBancaria(){}
    
    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
    
    public void Depositar(double cantidad){
        if (cantidad > 0){
            saldo += cantidad;
        }else{
            System.out.println("La cantidad a depositar debe ser positiva :( ");
        }
    }
    
    public void Retirar(double cantidad){
        if (cantidad > 0 && saldo >= cantidad){
            saldo -= cantidad;
        } else if(cantidad>saldo){
            System.out.println("No tienes fondos suficiete :(");
        }else {
            System.out.println("La cantidad debe ser positiva");
        }
    }
    
    public void mostrarSaldo(){
        System.out.println("Saldo: " + saldo);
    }
    
    
    
}
