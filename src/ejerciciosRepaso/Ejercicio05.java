/*
 * Declarar una variable de tipo entero.
 * Mostrar mensaje por consola indicando si el valor de la variable es par o impar,
 * positivo o negativo, multiplo de 5, multiplo de 10 y si es mayor o menor que 100
 */
package ejerciciosRepaso;

import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {

        int numero = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el número en pantalla: ");
        numero = sc.nextInt();

        if (numero%2 == 0){
            System.out.println("El número es par");
        }else{
            System.out.println("El número es impar");
        }

        if (numero > 0){
            System.out.println("El número es positivo");
        }else if(numero < 0){
            System.out.println("El número es negativo");
        }else{
            System.out.println("El número es 0");
        }

        if (numero%5 == 0){
            System.out.println("El número es múltiplo de 5");
        }else{
            System.out.println("El número NO es múltiplo de 5");
        }

        if (numero%10 == 0){
            System.out.println("El número es múltiplo de 10");
        }else{
            System.out.println("El número NO es múltiplo de 10");
        }

        if (numero > 100){
            System.out.println("El número es mayor que 100");
        }else{
            System.out.println("El número es menor que 100");
        }
    }
}
