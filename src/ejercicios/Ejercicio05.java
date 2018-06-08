/*
 * Desarrollar un programa que a partir de un determinado número,
 * vaya realizando la suma de todos los números consecutivos a dicho número.
 * El proceso finalizará cuando se alcance o supere el valor de 100.
 * Se mostrará solo el resultado final.
 */

package ejercicios;

import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {

        int numero;
        int suma = 0;

        System.out.println("EJERCICIO 05");
        System.out.println("============");

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        numero = sc.nextInt();

        for (int i = numero; suma <= 100; i++){
            //suma = suma + i;
            suma += i;
            System.out.println("Resultado = " + suma);
        }

        System.out.println("Resultado final = " + suma);
    }
}
