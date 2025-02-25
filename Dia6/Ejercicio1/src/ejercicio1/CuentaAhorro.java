/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

public class CuentaAhorro extends CuentaBancaria{
    
    private double tasaInteres;

    public CuentaAhorro(double tasaInteres, double saldo) {
        super(saldo);
        this.tasaInteres = tasaInteres;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }
    
    

    public void aplicarInteres(){
        double nuevoSaldo = getSaldo() + getSaldo() * tasaInteres / 100;
        setSaldo(nuevoSaldo);
        System.out.println("Nuevo saldo: " + getSaldo());
    }
    
    
}
