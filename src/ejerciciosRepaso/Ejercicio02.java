/*
 * Declarar 2 variables X e Y de tipo entero, 2 variables M y N de tipo decimal.
 * Asignarles un valor.
 * Pintar por consola las operaciones matemáticas que se te ocurran
 */
package ejerciciosRepaso;

public class Ejercicio02 {

    public static void main(String[] args) {

        int entero1 = 6;
        int entero2 = 9;
        double decimal1 = 5.78;
        double decimal2 = 3.45;

        //Operaciones matemáticas
        System.out.println("Suma de enteros: " + (entero1+entero2));
        System.out.println("Resta de enteros: " + (entero1-entero2));
        System.out.println("Multiplicación de enteros: " + (entero1*entero2));
        System.out.println("División de enteros: " + (entero1/entero2));

        System.out.println("Suma de decimales: " + (decimal1+decimal2));
        System.out.println("Resta de decimales: " + (decimal1-decimal2));
        System.out.println("Multiplicación de decimales: " + (decimal1*decimal2));
        System.out.println("División de decimales: " + (decimal1/decimal2));
    }

}
