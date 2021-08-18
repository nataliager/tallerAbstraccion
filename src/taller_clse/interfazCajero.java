/*
 * Clase interfazCajero.Java
 * Implementa las intercaes: retiro, Deposito, consulta, transferencia.
 * Definición de metodos que se utilizan, implementados de las inetrfaces.
 */
package taller_clse;
import java.util.Scanner;

/**
 *
 * @author Jhon Correa, Natalia Giraldo, Miguel Paz.
 */
public class interfazCajero implements retiro, Deposito, consulta, transferencia {
    
    //Definicion atributos.
    private int saldo;
    private String titular;
    
    //constructor
    public interfazCajero(int saldo, String titular){
        this.saldo = saldo;
        this.titular = titular;
    }
    
    //creación Scanner.
    Scanner scanner = new Scanner (System.in);
    
    //Metodo interfaz
    public void interfaz ()
    {
        System.out.println("Ingrese su identificacion");
        int entrada1 = scanner.nextInt();
        System.out.println("¿Que accion desea realizar?");
        System.out.println("1) Retirar");
        System.out.println("2) Depositar");
        System.out.println("3) Transferencia");
        System.out.println("4) consultar");
        System.out.println("****************************");
        int opcion=scanner.nextInt();
        switch(opcion)
        {
            case 1:retirar();
            break;
            case 2: depositar();
            break;
            case 3 : transferir();
            break;
            case 4:  consultar();
            break;
            default:
                System.out.println("Opcion invalida");
        } 
    }// fin metodo interfaz

    //metodos implementados de las interfaces
    @Override
    public void retirar() {
        System.out.print("Ingrese el monto que desea retirar: ");
        int retiro=scanner.nextInt();
        System.out.println("Se ha retirado exitosamente: " +retiro);
    }
    
    @Override
    public void depositar() {
        System.out.print("Ingrese el monto que desea depositar: ");
        int deposito=scanner.nextInt();
        int saldoActual = (deposito + saldo);
        System.out.println("Se deposito existosamente: " +deposito);
        System.out.println("Saldo actual: " +saldoActual);
    }

    @Override
    public void consultar() {
        System.out.println("Informacion de la cuenta");
        System.out.println("Titular de la cuenta: " +titular);
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
}// fin de la clase interfazCajero
