/*
 * Programa que pase una velocidad en KM/H a M/S.
 */

package ejerciciosSecuenciales;

import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int velkm;
        int velms;
        int opcion = 0;

        do{
            System.out.println("EJERCICIO 02");
            System.out.println("============");
            System.out.print("Introduzca la velodicad en KM/H: ");
            velkm = sc.nextInt();
            opcion = velkm;

            if (opcion != 0){
                // 1km = 1000m
                // 1h  = 3600s
                // 1 km / 1h --> 1m / 1s
                velms = velkm * 1000 / 3600;
                System.out.println("La velocidad en M/S sería: " + velms);
            }else{
                System.out.println("Hasta luego!!!");
            }

        }while (opcion != 0);
    }

}
