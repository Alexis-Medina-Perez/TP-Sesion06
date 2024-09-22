
package programas;

/*
Crear un programa en java que permita ingresar una cantidad.
Visualizar el numero de digitos de la cantidad ingresada

Por ejemplo:

cantidad = 1234
resultado:
cantdig = 4
*/

import java.util.Scanner;

public class Programa01 {
    public static void main(String[] args) {
        //Declarar variables
        int cantidad, cantidadDig;
        
        Scanner lectura = new Scanner(System.in);
        
        //Entrada de datos
        System.out.print("Ingrese una cantidad: ");
        cantidad = lectura.nextInt();
        
        //Proceso de datos
        cantidadDig = 0;
        
        while (cantidad > 0) {            
            cantidadDig++;
            cantidad = cantidad/10;
        }
        
        //Salida de datos
        System.out.println("La cantidad de digitos es: " + cantidadDig);
    }
    
}
