/*
 * Clase main, public class InterfazUsuario
 * Administra el menu principal.
 * Se crean objetos de otras clases implementadas.
 * Fecha de creación: Martes, 14 de julio del 2020.
 * Ultima modificación: Miercoles, 15 de julio del 2020.
 */
package taller_clse;
import java.util.Scanner;

/**
 *
 * @author Jhon Correa, Miguel Paz, Natalia Giraldo.
 */
public class InterfazUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creación de objetos implementados de las interfaces.
       interfazCajero Cajero = new interfazCajero(3000000, "Pepito");
       interfazWeb Web = new interfazWeb (3000000, "Pepito");
       interfazVoz Voz = new interfazVoz (3000000, "Pepito");
        
       //Imprime en pantalla el menú.
        System.out.println("****Bienvenido a Banco Agrario****");
        System.out.println ("Metodo de consulta");
        System.out.println("Seleccione la opcion que desea");
        System.out.println("1) Cajero");
        System.out.println("2) voz");
        System.out.println("3) via web");
        System.out.println("**********************************");
        Scanner input = new Scanner (System.in);//Creación Scanner.
        int opcion=input.nextInt();// pide al usuario la opción.
        
        switch(opcion)
        {
            case 1: Cajero.interfaz();  
            break;
            case 2: Voz.VozInterfaz();
            break;
            case 3: Web.WebInterfaz();
            break;
            default:
                System.out.println("opcion incorrecto");
                    
                    
        }
        
    }
    
}
