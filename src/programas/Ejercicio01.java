/*
Crear un programa en Java que permita al usuario ingresar un número y un número 
máximo, y luego muestre la tabla de multiplicar del número ingresado desde 0 
hasta el número máximo.

Por ejemplo:

numero = 5 
numeroMax = 12
6 x 0 = 0
6 x 1 = 6
6 x 2 = 12
6 x 3 = 18
6 x 4 = 24
6 x 5 = 30
6 x 6 = 36
6 x 7 = 42
6 x 8 = 48
*/

package programas;

import java.util.Scanner;
        
public class Ejercicio01 {
    public static void main(String[] args) {
        //Declarar variables
        int numero, numeroMax, i, resultado;
        Scanner lectura = new Scanner(System.in);
        
        //Ingreso de datos
        System.out.print("Ingrese un numero: ");
        numero = lectura.nextInt();
        System.out.print("Ingrese hasta que numero deseas multiplicar: ");
        numeroMax = lectura.nextInt();
        
        //Proceso de datos
        i = 0;
        
        while (i <= numeroMax) {            
            resultado = numero * i;
            
            //Salida de datos
            System.out.println( numero + " x " + i + " = " + resultado);
            
            i++;
        }
    }
    
}
