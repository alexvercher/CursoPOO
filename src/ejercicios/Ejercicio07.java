/*
 * Primera calculadora
 */
package ejercicios;

import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {

        int opcion = 0;
        int a = 0;
        int b = 0;
        int resultado = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("MENU CALCULADORA");
            System.out.println("================");
            System.out.println("1-. Sumar");
            System.out.println("2-. Restar");
            System.out.println("0-. Salir");
            System.out.println("================");
            System.out.print("Has elegido la opción: ");
            opcion = sc.nextInt();

            if (opcion == 0){
                System.out.println("Hasta luego");
            } else {
                System.out.print("Elija el número A: ");
                a = sc.nextInt();
                System.out.print("Elija el número B: ");
                b = sc.nextInt();
                if (opcion == 1){
                    resultado = a + b;
                    System.out.println("El resultado es: " + resultado);
                } else {
                    resultado = a - b;
                    System.out.println("El resultado es: " + resultado);
                }
            }
        } while (opcion != 0);
    }
}
