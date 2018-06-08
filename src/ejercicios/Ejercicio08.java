/*
 * Dado un array de strings vamos a mostrar por consola la cadena de mayor
 * número de caracteteres
 * String [] cadenas = {"java Duke Nuke", "Esto es una cadena de gran longitud"}
 */
package ejercicios;

public class Ejercicio08 {

    public static void main(String[] args) {
        //Variables locales
        int longitud = 0;
        String cadena = "";
        String[] cadenas = {"java Duke Nuke", "Esto es una cadena de gran longitud", "Esto es otra cadena"};

        for (int i=0; i < cadenas.length; i++){

            if (cadenas[i].length() > longitud){
                cadena = cadenas[i];
                longitud = cadena.length();
            }
        }
        System.out.println("La cadena más larga es " + cadena + " y tiene " + longitud + " caracteres");
    }
}
