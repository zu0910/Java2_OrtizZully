/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author const
 */
import java.util.ArrayList;
import java.util.List;

 
    
public class FiltroClientes {

    public static class filtroPorLocalidad implements Filtro{

        private Localidad localidad;

        public filtroPorLocalidad(Localidad localidad){
            this.localidad = localidad;
        }

        public List<Cliente> filtrar(List<Cliente> clientes) {
            List<Cliente> filteredList = new ArrayList<>();
            for (Cliente cliente : clientes) {
                if (cliente.localidad == localidad) {
                    filteredList.add(cliente);
                }
            }
            return filteredList;
        }
    }

    public static class filtroPorNombre implements Filtro{

        private String nombre;

        public filtroPorNombre(String nombre){
            this.nombre = nombre;
        }

        public List<Cliente> filtrar(List<Cliente> clientes) {
            List<Cliente> filteredList = new ArrayList<>();
            for (Cliente cliente : clientes) {
                if (cliente.nombre.equals(nombre)) {
                    filteredList.add(cliente);
                }
            }
            return filteredList;
        }
    }

    public static class filtroConSaldo implements Filtro{
        public List<Cliente> filtrar(List<Cliente> clientes) {
            List<Cliente> filteredList = new ArrayList<>();
            for (Cliente cliente : clientes) {
                if (cliente.saldo > 0) {
                    filteredList.add(cliente);
                }
            }
            return filteredList;
        }   
    }  
}
