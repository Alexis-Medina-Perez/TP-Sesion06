/*
Crear un programa en Java que permita al usuario ingresar dos números 
diferentes positivos y luego muestre la suma del rango de los números indicados.

Por ejemplo:

numeroInicial = 5
numeroFinal = 12
suma = 68
*/
package programas;

import java.util.Scanner;
public class Ejercicio02 {
    public static void main(String[] args) {
        //Declarar variables
        int numInicio, numFin, resultado, contador;
        Scanner lectura = new Scanner(System.in);
        
        //Ingreso de datos
        System.out.print("Ingrese el numero inicial: ");
        numInicio = lectura.nextInt();
        System.out.print("Ingrese el numero final: ");
        numFin = lectura.nextInt();
        
        //Proceso de datos
        resultado = 0;
        contador = numInicio;
        
        while (contador <= numFin) {            
            resultado += contador;
            contador++;
        }
        
        //Salida de datos
        System.out.println("La suma total es: " + resultado);
    }
}
