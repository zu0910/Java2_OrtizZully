/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;


import java.util.ArrayList;
import java.util.List;

public class LogicaClientes {

    private List<Cliente> clientes =  new ArrayList<Cliente>();

        public List<Cliente> getClientes() {
            return clientes;
        }
        
        public List<Cliente> aplicarFiltro(Filtro filtro){
            return filtro.filtrar(clientes);
        }
    }
 

