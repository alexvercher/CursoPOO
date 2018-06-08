/*
 * Leer un número de 3 cifras y mostrar sus cifras por separado
 */

package ejerciciosSecuenciales;

import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {

        int numero = 0;
        String cadena;
        Scanner sc = new Scanner(System.in);

        //Solicitar el número al usuario
        System.out.println("Introduce el numero de 3 cifras: ");
        numero = sc.nextInt();
        cadena = String.valueOf(numero);

        for (int i=0; i<cadena.length(); i++){
            System.out.println(cadena.charAt(i));
        }
    }
}
