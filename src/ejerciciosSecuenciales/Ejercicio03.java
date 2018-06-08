/*
 * Calcular el área de un triángulo a partir de la longitud de sus lados
 * Raiz cuadrada [p (p - a)(p - b)(p - c)]
 * p = (a + b + c) / 2
 */

package ejerciciosSecuenciales;

import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {

        double a, b, c;
        double area;
        double perimetro;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el valor del lado 1: ");
        a = sc.nextInt();
        System.out.print("Introduce el valor del lado 2: ");
        b = sc.nextInt();
        System.out.print("Introduce el valor del lado 3: ");
        c = sc.nextInt();

        perimetro = (a + b + c) / 2;
        area = Math.sqrt(perimetro*(perimetro-a)*(perimetro-b)*(perimetro-c));

        System.out.println("El área del triángulo dados sus 3 lados es: " + area);
    }
}
