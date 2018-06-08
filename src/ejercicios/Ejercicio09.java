/*
 * Dada una cadena vamos a contar el número de vocales que tiene
 */
package ejercicios;

public class Ejercicio09 {

    public static void main(String[] args) {

        String cadena = "Esto es una cadena de caracteres";
        cadena.toLowerCase();
        int contador = 0;

        for (int i= 0; i < cadena.length(); i++){
            switch (cadena.charAt(i)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    //contador += 1;
                    contador++;
            }
        }
        System.out.println("Número de vocales encontradas: " + contador);
    }

}
