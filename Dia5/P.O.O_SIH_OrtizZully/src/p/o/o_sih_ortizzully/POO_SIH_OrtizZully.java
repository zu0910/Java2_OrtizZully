/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p.o.o_sih_ortizzully;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author const
 */
public class POO_SIH_OrtizZully {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner teclado = new Scanner(System.in);
         
         ArrayList<Personal> ListaPersonal = new ArrayList<>();
         ArrayList<Paciente> ListaPaciente = new ArrayList<>();
         ArrayList<Departamento> ListaDepartamento = new ArrayList<>();
         ArrayList<Doctor> ListaDoctor = new ArrayList<>();
         ArrayList<Hospital> ListaHospital = new ArrayList<>();
         ArrayList<EquipoMedico> ListaEquipoMedico = new ArrayList<>();
         ArrayList<Pabellon> ListaPabellon = new ArrayList<>();
         
        boolean salir = false;
        
        while(salir == false){
            System.out.println("----------- SISTEMA INTEGRADO HOSPITARIO--------------");
            System.out.println("1). Agregar personal. ");
            System.out.println("2). Mostrar personal.");
            System.out.println("3). Eliminar personal");
            System.out.println("4). Actualizar personal");
            System.out.println("5). Agregar paciente.");
            System.out.println("6). Mostrar paciente.");
            System.out.println("7). Eliminar un paciente.");
            System.out.println("8). Actualizar paciente.");
            System.out.println("9). Agregar doctor.");
            System.out.println("10). Mostrar doctor.");
            System.out.println("0). Salir.");
            System.out.println("------------------------------------------------------");
            System.out.println("Ingrese unas de las opciones del menu: ");
            int opc = teclado.nextInt();
            teclado.nextLine();
            
            switch(opc){
                case 1:
                    
                    System.out.println("-------------- AGREGAR PERSONAL---------");
                    
                    System.out.print("Ingrese el Nombre Completo: ");
                    String nombreCompleto = teclado.nextLine();
                    
                    System.out.print("Ingrese la Dirección: ");
                    String direccion = teclado.nextLine();
                    
                    System.out.print("Ingrese el ID del Hospital: ");
                    int idHospital = teclado.nextInt();
                    teclado.nextLine();
                    
                    System.out.print("Ingrese el ID del departamento: ");
                    int idDepartamento = teclado.nextInt();

                    teclado.nextLine(); 
                    System.out.print("Ingrese el tipo de personal (Ej: Enfermero, Recepcionista): ");
                    String tipoPersonal = teclado.nextLine();

                    System.out.print("Ingrese el salario: ");
                    double salario = teclado.nextDouble();

                    System.out.println("Ingrese el ID de la persona: ");
                    int idPersona = teclado.nextInt();
                    teclado.nextLine();
                    
                    
                    ListaPersonal.add(new Personal( idHospital, idDepartamento, tipoPersonal, salario, idPersona, nombreCompleto, direccion));
                    
                    
                    System.out.println("Paciente agregado exitosamente.");

                    break;
                
                case 2:
                    
                    if(ListaPersonal.isEmpty()){
                        System.out.println("No hay personal registrado.");
                        
                    }else{
                        for ( Personal p: ListaPersonal){
                            System.out.println(p);
                        }
                    } 
                
                break;    
                    
                case 3:
                    System.out.println("Eliminar personal");
                    
                    if (ListaPersonal.isEmpty()){
                        System.out.println("No hay personal registrado para eliminar.");
                        
                    }else {
                        System.out.println("Ingrese el ID del personal a eliminar:");
                        int eliminarPersonal = teclado.nextInt();
                        teclado.nextLine();
                        
                        boolean encontrado = false;
                    
                        for (int i = 0; i < ListaPersonal.size(); i++){
                            if(ListaPersonal.get(i).id_personal == eliminarPersonal){
                                ListaPersonal.remove(i);
                                encontrado = true;
                                System.out.println("Personal eliminado correctamente");
                                break;
                            }
                        }
                        if (!encontrado){
                            System.out.println("No se encontro un personal con ese ID");
                        }
                    }
                    
                    
                    break;
                    
                case 4:
                    System.out.println("Actualizar personal");
                    
                    boolean terminar = false;
                    
                    while (terminar == false){
                        System.out.println("Que informacion deseas eliminar: ");
                        System.out.println("1). Nombre.");
                        System.out.println("2). Dirección. ");
                        System.out.println("3). Tipo de personal. ");
                        System.out.println("4). Salario");
                        System.out.println("0). Volver al menu principal.");
                        
                        int opc1 = teclado.nextInt();
                        
                        switch(opc1){
                            case 1:
                                System.out.println("Ingrese el nuevo nombre completo.");
                                String NewNomComp = teclado.nextLine();
                                ListaPersonal.nombre_completo = NewNomComp;
                                break;
                            case 2:
                                System.out.println("Ingrese la nueva direccion.");
                                String NewDireccion = teclado.nextLine();
                                break;
                            case 3:
                                System.out.println("Ingrese el nuevo personal.");
                                String NewPersonal = teclado.nextLine();
                                break;
                            case 4:
                                System.out.println("Ingrese el nuevo salario.");
                                double newSalario = teclado.nextDouble();
                                break;
                            case 0:
                                salir = true;
                                break;
                        }
                        
                    }
                    break;
               
                case 5: 
            
                    System.out.println("-------------- AGREGAR PACIENTE ---------");

                    System.out.print("Ingrese el Nombre Completo: ");
                    String nombreCompleto1 = teclado.nextLine();

                    System.out.print("Ingrese la Dirección: ");
                    String direccion1 = teclado.nextLine();

                    System.out.print("Ingrese el ID de la Persona: ");
                    int idPersona1 = teclado.nextInt();
                    teclado.nextLine(); 

                    System.out.print("Ingrese la Fecha de Nacimiento (YYYY-MM-DD): ");
                    String fechaNacimiento = teclado.nextLine();

                    System.out.print("Ingrese la Fecha de Ingreso (YYYY-MM-DD): ");
                    LocalDate fechaIngreso = LocalDate.parse(teclado.nextLine());

                    System.out.print("Ingrese el Diagnóstico: ");
                    String diagnostico = teclado.nextLine();

                    System.out.print("Ingrese el Número de Pabellón: ");
                    int pabellon = teclado.nextInt();
                    teclado.nextLine(); // Limpiar buffer

                    System.out.print("Ingrese el ID del Hospital: ");
                    int idHospital1 = teclado.nextInt();
                    teclado.nextLine(); // Limpiar buffer

                    
                    ListaPaciente.add(new Paciente(fechaNacimiento, fechaIngreso, diagnostico, pabellon, idHospital1, idPersona1, nombreCompleto1, direccion1));

                    System.out.println("Paciente agregado exitosamente.");
                    break;
                    
                case 6:
                    
                    if(ListaPaciente.isEmpty()){
                        System.out.println("No hay Paciente registrado.");
                        
                    }else{
                        for ( Paciente pa: ListaPaciente){
                            System.out.println(pa);
                        }
                    } 
                    
                    break;
                
                case 7: 
                    System.out.println("Eliminar Paciente");
                    
                    if (ListaPaciente.isEmpty()){
                        System.out.println("No hay pacientes registrados para eliminar.");
                        
                    }else {
                        System.out.println("Ingrese el ID del paciente a eliminar:");
                        int eliminarPaciente = teclado.nextInt();
                        teclado.nextLine();
                        
                        boolean encontrado = false;
                    
                        for (int i = 0; i < ListaPaciente.size(); i++){
                            if(ListaPaciente.get(i).id_paciente == eliminarPaciente){
                                ListaPaciente.remove(i);
                                encontrado = true;
                                System.out.println("Paciente eliminado correctamente");
                                break;
                            }
                        }
                        if (!encontrado){
                            System.out.println("No se encontro un paciente con ese ID");
                        }
                    }
                    break;
                    
                case 8:
                    break;
                    
                case 9:
                    break;
                    
                case 10:
                    break;
                case 0:
                    salir = true;
                    break;
            }
        }
        
       
        
        
    }
    
}
