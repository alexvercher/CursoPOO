/*
 * Dada una fecha de nacimiento (día, mes año), calcular el número de la suerte
 * 12/07/1980 --> 12+7+1980 --> 1999 --> 1 + 9 + 9 + 9 --> 28
 */
package ejerciciosSecuenciales;

import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {

        //Variables
        String fecha;
        int suerte = 0;
        int resultado = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu fecha de nacimiento (31/12/2018): ");
        fecha = sc.nextLine();

        String[] datos = fecha.split("/");

        //Punto de control
        System.out.println("INFO: El tamaño del array es: " + datos.length);

        for (String e:datos){
            suerte += Integer.parseInt(e);
        }

        //Punto de control
        System.out.println("INFO: Suerte vale: " + suerte);

        //Volver a convertir el número suerte en un string
        String aux = String.valueOf(suerte);

        for (int i=0; i<aux.length(); i++){
            String ch = String.valueOf(aux.charAt(i));
            resultado += Integer.parseInt(ch);
        }

        System.out.println("Tu número de la suerte es: " + resultado);
    }
}
