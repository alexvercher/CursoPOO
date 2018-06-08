/*
 * Escribir un programa que dado el precio de un producto, calcule el precio
 * aplicando un descuento del 15%
 */
package ejercicios;

import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        double precio_original;
        double precio_rebajado;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el precio del producto ");
        precio_original = sc.nextDouble();

        precio_rebajado = precio_original * (0.85);

        System.out.println("El precio original " + precio_original + " quedaría con el descuento "
                + precio_rebajado);
    }
}
