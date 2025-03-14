
package conexionmysql;

import java.util.Scanner;

/**
 *
 * @author const
 */
public class ConexionMySQL {

    public static void main(String[] args) {
        /*dbConnection dbc = new dbConnection();
        dbc.conectar();*/
       
       CRUD crud = new CRUD();
       Scanner teclado = new Scanner(System.in);
       
       boolean salir = false;
       
       while (salir == false){
           System.out.println("--------------- CRUD DE PERSONAS -------------");
           System.out.println("1). Agregar persona.");
           System.out.println("2). Listar persona.");
           System.out.println("3). Actualizar persona.");
           System.out.println("4). Eliminar persona.");
           System.out.println("5). Salir.");
           System.out.println("Ingrese una de las opciones del menu: ");
           int opc = teclado.nextInt();
           teclado.nextLine();
           
           switch (opc){
               case 1:
                   
                   System.out.println("---------- AGREGAR PERSONA --------");
                   System.out.println("Ingrese el nombre: ");
                   String nombre = teclado.nextLine();
                   System.out.println("Ingrese el correo: ");
                   String correo = teclado.nextLine();
                   crud.crearPersona(nombre, correo);
                   break;
                   
               case 2:
                   
                   crud.listarPersona();
                   
                   break;
               case 3:
                   
                   System.out.println(" ----- ACTUALIZAR PERSONA ---------");
                   System.out.println("Ingrese le ID de la persona a actualizar: ");
                   int idAct = teclado.nextInt();
                   teclado.nextLine();
                   System.out.println("Ingrese el nombre nuevo: ");
                   String nombreNew = teclado.nextLine();
                   System.out.println("Ingrese el nuevo correo: ");
                   String correoNew = teclado.nextLine();
                   
                   crud.ActualizarPersona(idAct, nombreNew, correoNew);
                   break;
                   
               case 4:
                   
                   System.out.println("Ingrese ID de la persona que desea eliminar: ");
                   int idElimi = teclado.nextInt();
                   crud.EliminarPersona(idElimi);
                   break;
                   
               case 5:
                   System.out.println("Saliendo del programa... ");
                   salir = true;
                   break;
               default:
                   System.out.println("Lo siento la opcion no es valida");
                   
           }
       }
       
    }
    
}
