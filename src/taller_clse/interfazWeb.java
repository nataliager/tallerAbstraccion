/*
 * Clase interfazWeb.Java 
 * Implementa las intercaes: retiro, Deposito, consulta, transferencia.
 * Definición de metodos que se utilizan, implementados de las inetrfaces.
 */
package taller_clse;
import java.util.Scanner;

/**
 *
 * @author Jhon Correa, Natalia Giraldo, Miguel Paz.
 */

public class interfazWeb implements retiro, consulta, transferencia, RecargaMovil
{//nombre de ususario y pin
    
    // definición atributos
    private int saldo;
    private String usuario;
    
    //constructor 
    public interfazWeb(int saldo, String usuario){
        this.saldo = saldo;
        this.usuario = usuario;
    }
    
    Scanner scanner = new Scanner (System.in);//scanner
    
    //Metodo WebInterfaz
    public void WebInterfaz ()
    {
        System.out.println("Ingrese su Pin: ");
        int pin = scanner.nextInt();
        System.out.println("¿Que accion desea realizar?");
        System.out.println("1) Retirar");
        System.out.println("2) Transferencia");
        System.out.println("3) Recarga movil");
        System.out.println("4) consultar");
        System.out.println("**********************************");
        
        int opcion=scanner.nextInt();
        switch(opcion)
        {
            case 1:retirar();
            break;
            case 2 : transferir();
            break;
            case 3 : recargar();
            break;
            case 4:  consultar();
            break;
            default:
                System.out.println("Opcion invalida");
        } 
    }//fin metodo WebInterfaz
    
    //metodos implementados de las interfaces
    @Override
    public void retirar() {
        System.out.print("Ingrese el monto que desea retirar: ");
        int retiro=scanner.nextInt();
        System.out.println("Su codigo transaccional es: 643-123");
    }
   
    @Override
    public void consultar() {
        System.out.println("**Informacion de la cuenta**");
        System.out.println("Usuario: " +usuario);
        System.out.println("Saldo Actual: " +saldo);
    }

    @Override
    public void transferir() {
        
        System.out.print("Ingrese el numero de cuenta a transferir: ");
        int numCuenta = scanner.nextInt();
        System.out.print("Ingrese el monto a tranferir: ");
        int monto = scanner.nextInt();
        saldo -= monto;
        System.out.println("Valor transferido: " +monto);
        System.out.println("Saldo actual: " +saldo);
    }

    @Override
    public void recargar() {
        
        System.out.print("Ingrese el numero telefonico: ");
        int numeroTelefonico = scanner.nextInt();
        System.out.println("Ingrese el operador: ");
        String operador = scanner.next();
        System.out.print("Ingrese el valor de la recarga: ");
        int valor = scanner.nextInt();
        System.out.println("Recarga existosa!");
    }
}//fin de la clase interfazWeb

