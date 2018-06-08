/*
 * Declarar 4 variables de tipo entero y asignarle valor.
 * Operaciones para que B tome el valor de C, C el valor de A, A el valor de D y
 * D el valor de B
 */
package ejerciciosRepaso;

public class Ejercicio04 {

    public static void main(String[] args) {

        int A = 10;
        int B = 15;
        int C = 20;
        int D = 25;
        int aux = 0;

        aux = A;
        A = D;
        D = B;
        B = C;
        C = aux;
    }

}
