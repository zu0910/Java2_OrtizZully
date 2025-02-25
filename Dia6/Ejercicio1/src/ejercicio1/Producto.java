/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

public class Producto {
    
    // Atributos privados 
    private String codigo;
    private String nombre;
    private int cantidad;
    private double precio;
    
    public Producto(){}

    public Producto(String codigo, String nombre, int cantidad, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }
 
    // La cantidad no puede ser negativa. 
    public void setCantidad(int cantidad) {
        if (cantidad >= 0){
            this.cantidad = cantidad;
        } else {
            System.out.println("La cantidad no puede ser negativa. :( ");
        }
    }

    public double getPrecio() {
        return precio;
    }

    // El precio sea mayor a 0.
    public void setPrecio(double precio) {
        if (precio > 0){
            this.precio = precio;
        } else {
            System.out.println("El precio debe ser mayor a 0. :( ");
        }
    }
    
    /* Un método actualizarStock(int cantidad) que sume (o reste, si la cantidad es negativa) al stock actual y que verifique que el stock no quede negativo.
    Implementa la clase Producto con la lógica anterior.Crea una clase InventarioTest con el método main para:
    Instanciar varios objetos de Producto.
    Simular operaciones de venta y reposición de stock.
    Imprimir el estado del inventario después de cada operación.*/
    
    public void actualizarStock(int cantidad){
        if(this.cantidad + cantidad >= 0){
            this.cantidad += cantidad;
        } else {
            System.out.println("Lo siento el stock no puede quedar negativo. :( ");
        }
    }
    
    // Mostrar productos
    
    public void MostrarProducto(){
        System.out.println("-------- PRODUCTO -----------");
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio: " + precio);
    }
    
   
    
    
}
