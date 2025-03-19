/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc.Modelo;

// Modelo 
// El modelo representa los datos y la logica de acceso a la bbdd
public class Usuario {
    private int id;
    private String nombre;
    private String email;

    public Usuario(int id) {
        this.id = id;
    }
    public Usuario(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }
    public Usuario( String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "id=" + id + ", nombre=" + nombre + ", email=" + email ;
    }
    
    
}
