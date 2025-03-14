/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patronesdiseno_estructurales.facade;

/*Facade (fachada)
Proporciona una interfaz simplificado a un conjunto de clases mas complejas
 */
public class Patronesdiseno_estructuralesFacade {

    static class Amplifier {
        void on(){
            System.out.println("Amplificador encendido.");
        }
    }
    
    static class DVDPlayer{
        void play(){
            System.out.println("Reproduciendo DVD.");
        }
    }
    
    static class HomeTheaterFacade{
        private Amplifier amp;
        private DVDPlayer dvd;
        
        public HomeTheaterFacade(){
            this.amp = new Amplifier();
            this.dvd = new DVDPlayer();
        }
        
        public void watchMovie(){
            amp.on();
            dvd.play();
        }
    }
    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade();
        homeTheater.watchMovie();
    }
    
}
