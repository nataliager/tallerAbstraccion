/*
 * Clase interfazVoz.Java 
 * Implementa las intercaes: retiro, Deposito, consulta, transferencia.
 * Definición de metodos que se utilizan, implementados de las inetrfaces.
 */
package taller_clse;
import java.util.Scanner;

/**
 *
 * @author Jhon Correa, Natalia Giraldo, Miguel Paz.
 */

public class interfazVoz implements retiro, consulta, transferencia, RecargaMovil
{ 
    //Definición atributos
    private int saldo;
    private String titular;
    
    //constructor
    public interfazVoz(int saldo, String titular){
        this.saldo = saldo;
        this.titular = titular;
    }
    
    
    Scanner scanner = new Scanner (System.in);// scanner
    
    //Metodo VozInterfaz
    public void VozInterfaz ()
    {
        System.out.println("Diga: Hola");
        System.out.println("Reconociendo voz...");
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
            case 3 : transferir();//***
            break;
            case 4:  consultar();
            break;
            default:
             System.out.println("Opcion invalida");
        } 
    }// fin metodo VozInterface

    //metodos implementados de las interfaces
    @Override
    public void retirar() {
        System.out.print("digete su numero telefonico: ");
        int numero =scanner.nextInt();
        System.out.print("digete el monto que desea retirar: ");
        int retiro=scanner.nextInt();
        System.out.println("Diga el codigo con voz clara");
        System.out.println("Reconociendo voz...");
        System.out.println("Reconociendo voz...");
        System.out.println("Retiro exitoso!");
    }
   
    @Override
    public void consultar() {
        System.out.println("Informacion de la cuenta");
        System.out.println("Usuario: " +titular);
        System.out.println("Saldo Actual: " +saldo);
    }

    @Override
    public void transferir() {
        
        System.out.print("Digite el numero de celular al que desea transferir: ");
        int numeroTransferencia = scanner.nextInt();
        System.out.print("Ingrese el monto a tranferir: ");
        int monto = scanner.nextInt();
        saldo -= monto;
        System.out.println("Valor transferido: " +monto);
        System.out.println("Saldo actual: " +saldo);
    }

    @Override
    public void recargar() {
        
        System.out.print("Digite el numero telefonico al que desea recargar: ");
        int numeroRecarga = scanner.nextInt();
        System.out.print("Ingrese el operador: ");
        String operador = scanner.nextLine();
        System.out.print("Ingrese el valor de la recarga: ");
        int valor = scanner.nextInt();
        System.out.println("Recarga existosa!");
    }
}//fin de la clase interfazVoz
    

