package programas;

/*
Crear un programa en java que permita ingresar una cantidad.
Visualizar el dígito mayor, la cantidad de dígitos impares y la suma de digitos pares

Por ejemplo:

cantidad = 78952
digito mayor = 9
cantidadDigImpar = 3
sumaDigPares = 10
*/

import java.util.Scanner;
public class Programa03 {
    public static void main(String[] args) {
        //Declarar variables
        int cantidad, digitoMayor, cantDigImpar, SumDigPares, digito, resultado;
        Scanner lectura = new Scanner(System.in);
        
        //Entrada de datos
        System.out.print("Ingrese la cantidad: ");
        cantidad = lectura.nextInt();
        
        //Proceso de datos
        digitoMayor = 0;
        cantDigImpar = 0;
        SumDigPares = 0;
        
        while (cantidad > 0) {
            digito = cantidad % 10;
            
            if (digito > digitoMayor) {
                digitoMayor = digito;
            }
            
            resultado = digito % 2;
            if (resultado == 0) {
                SumDigPares = SumDigPares + digito;
            }else{
                cantDigImpar++;
            }
            
            cantidad = cantidad / 10;            
        }
        
        //Salida de datos
        System.out.println("El digito mayor es: " + digitoMayor);
        System.out.println("La cantidad de digitos impares es: " + cantDigImpar);
        System.out.println("La suma de digitos pares es: " + SumDigPares);
    }
}
