package programas;

/*
Crear un programa en java que permita ingresar una cantidad.
Visualizar la cantidad ingresada de forma invertida

Por ejemplo:

cantidad = 123
resultado:
cantdig = 321
*/

import java.util.Scanner;
public class Programa02 {
    public static void main(String[] args) {
        //Declarar variables
        int cantidad, cantidadInv, digito;        
        Scanner lectura = new Scanner(System.in);
        
        //Entrada de datos
        System.out.print("Ingrese la cantidad: ");
        cantidad = lectura.nextInt();
        
        //Proceso de datos
        cantidadInv = 0;
        
        while (cantidad > 0) {
            digito = cantidad % 10;            
            cantidadInv = (cantidadInv * 10) + digito;            
            cantidad = cantidad / 10;
        }
        
        //Salida de datos
        System.out.println("La cantidad invertida es: " + cantidadInv);
    }
}
