/*
 * Programa una aplicación que realice lo siguiten:
 * Declarar 3 variables, un entero, un decimal y un caracter, y asignarles un
 * valor correcto.
 * Pintar por consola el valor de cada variable concatenado con el nombre de cada una.
 * Pintar por consola los cálculos del entero + el decimal y del decimal - el entero.
 */
package ejerciciosRepaso;

public class Ejercicio01 {

    public static void main(String[] args) {
        //Declaramos las variables solicitadas y asignamos valores válidos
        int entero = 23;
        float decimal = 1.15f;
        char caracter = 's';

        //Pintamos por consola los valores
        System.out.println("El valor de la variable entera es: " + entero);
        System.out.println("El valor de la variable float es: " + decimal);
        System.out.println("El valor de la variable char es: " + caracter);

        //Pintamos el valor de las operaciones
        System.out.println("El resultado de entero + decimal es = " + (entero+decimal));
        System.out.println("El resultado de entero - decimal es = " + (entero-decimal));
    }
}
