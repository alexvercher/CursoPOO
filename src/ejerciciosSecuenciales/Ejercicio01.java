/*
 * Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit.
 * La fórmula corespondiente es: F = 32 + (9 * C / 5)
 */

package ejerciciosSecuenciales;

import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
        //Declarar variables
        int cent;
        int fah;
        int opcion = 0;
        Scanner sc = new Scanner(System.in);

        //Mostrar al usuario el menú contextual
        do{
            System.out.println("EJERCICIO 01");
            System.out.println("============");
            System.out.print("Introduce los grados centígrados o introduce 0 para salir: ");
            cent = sc.nextInt();
            opcion = cent;

            if (opcion !=0){
                System.out.println("El resultado en Fahrenheit es: " + (32 + (9 * cent / 5)));
                System.out.println("El resultado en Centígrados es: ");
            }else{
                System.out.println("Hasta pronto!!!");
            }
        }while(opcion != 0);
    }

}