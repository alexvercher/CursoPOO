/*
 * Pedir al usuario que indroduzca dos números enteros y vamos a decir si son
 * iguales o a es mayor o menor que b.
 */
package ejercicios;

import java.util.Scanner;

public class Ejercicio01 {

    private static Scanner sc;

	public static void main(String[] args) {
        // Creamos dos variables donde almacenar los números solicitados
        int a = 1;
        int b = 2;

        sc = new Scanner(System.in);

        //Pedir al usuario que introduzca 2 números enteros.
        System.out.println("EJERCICIO 01");
        System.out.println("============");
        System.out.println("Introduce un número entero: ");
        //Almacenamos el n�mero que escribe el usuario
        a = sc.nextInt();
        //Solicitamos el segundo número
        System.out.println("Introduce otro número entero: ");
        //Almacenamos el segundo número
        b = sc.nextInt();

        //Comprobamos si a es mayor, menor o igual que b

        if (a > b){
            System.out.println("A ("+ a +") es mayor que B ("+ b +")");
        } else if (a < b){
            System.out.println("A ("+ a +") es menor que B ("+ b +")");
        }else {
            System.out.println("A ("+ a +") es igual que B ("+ b +")");
        }
    }
}