/*
 * Escribir un programa que escriba en la pantalla tu nombre completo en una
 * línea y en la siguiente línea tu fecha de nacimiento.
 */
package ejercicios;

import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
        String nombre = "Alejandro Vercher";
        String f_nacim = "05/05/1980";
        System.out.println(nombre+" nacido el "+f_nacim);

        // Con Scanner
        String nombre2;
        String f_nacim2;
        Scanner sc = new Scanner(System.in);
        // Mensajes por consola
        System.out.println("EJERCICIO02");
        System.out.println("===========");
        System.out.print("Introduce el nombre: ");
        nombre2 = sc.nextLine();
        System.out.print("Introduce la fecha de nacimiento: ");
        f_nacim2 = sc.nextLine();

        System.out.println("Mi nombre es " + nombre2 + " y mi fecha de nacimiento es " + f_nacim2);

    }
}
