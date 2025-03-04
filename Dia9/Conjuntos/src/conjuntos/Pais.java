/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conjuntos;

/**
 *
 * @author Uniminuto Tibu
 */
public enum Pais {
    // Enumeradores
    // Un ennumerador es una clase especial que restringe la creación de objetos a los valores especificamente
    // definidos en su implementacion.
    
    ESPANA("España", "Madrid"), 
    FRANCIA("Francia", "Paris"), 
    ITALIA("Italia", "Roma"),
    REINO_UNIDO("Reino Unido", "Londres");
    
    private String nombre;
    private String capital;

    private Pais(String nombre, String capital) {
        this.nombre = nombre;
        this.capital = capital;
    }

    public String getNombre() {
        return nombre;
    }


    public String getCapital() {
        return capital;
    }

    
    
}
