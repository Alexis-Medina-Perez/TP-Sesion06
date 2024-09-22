/*
Crear un programa en Java que permita al usuario ingresar una palabra
y luego muestre la cantidad de vocales de la palabra ingresada.

Por ejemplo:

cadena = manzana
cantidadVocal = 3
*/

package programas;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        // Declarar variables
        String cadena;
        char letra;
        int cadenaCaracteres, contadorVocal, incrementador;
        Scanner lectura = new Scanner(System.in);
        
        // Entrada de datos
        System.out.print("Ingrese una palabra: ");
        cadena = lectura.next();
        
        // Proceso de datos
        contadorVocal = 0;
        incrementador = 0;
        cadenaCaracteres = cadena.length();
        
        while (incrementador < cadenaCaracteres) {            
            letra = cadena.charAt(incrementador);
            
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
                letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                
                contadorVocal++;
            }
            
            incrementador++;
        }
        
        // Salida de datos
        System.out.println("El numero de vocales es: " + contadorVocal);
    }
}