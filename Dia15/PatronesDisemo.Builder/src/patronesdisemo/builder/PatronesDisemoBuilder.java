/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patronesdisemo.builder;

/*
    BUILDER
    Se usa para construir objetos complejos paso a paso.
Es util cuando hya muchas configuraciones posibles para un objeto
 */
public class PatronesDisemoBuilder {

    static class Computadora {
        private String procesador;
        private int ram;
        private boolean tarjetaGrafica;
        
        // Constructor privado

        private Computadora(Builder builder) {
            this.procesador = builder.procesador;
            this.ram = builder.ram;
            this.tarjetaGrafica = builder.tarjetaGrafica;
        }
        
        public void mostrarConfiguracion(){
            System.out.println("Computadora con" + procesador + ", RAM: " + ram + "GB, Tarjeta gráfica: " + tarjetaGrafica);
        }
    }
    public static class Builder {
        
        private String procesador;
        private int ram;
        private boolean tarjetaGrafica;
        
        public Builder setProcesador(String procesador){
            this.procesador = procesador;
            return this;
        }
        
        public Builder setRam(int ram){
            this.ram = ram;
            return this;
        }
        
        public Builder setTarjetaGrafica(boolean tarjetaGrafica){
            this.tarjetaGrafica =  tarjetaGrafica;
            return this;
        }
        
        public Computadora build() {
            return new Computadora(this);
        }
        
        public class BuilderDemo{
            public static void PatronesDisemoBuilder(String[] args){
                Computadora pc = new Computadora.Builder()
                        .setPrecesador("Inter 17")
                        .setRam(16)
                        .setTarjetaGrafica(true)
                        .build();
                
                pc.mostrarConfiguracion();
            }
        }
    }
    
}
