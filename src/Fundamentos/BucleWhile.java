package Fundamentos;

import java.util.Scanner;

public class BucleWhile {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        while (a > b){
            System.out.println("A sigue siendo mayor que B: " + b);
            b++;
        }

        System.out.println("===============================");
        int opcion = 0;
        Scanner sc = new Scanner (System.in);

        do {
            System.out.println("MENU PRINCIPAL");
            System.out.println("--------------");
            System.out.println("Elige una opción");
            System.out.println("1-. Suma");
            System.out.println("2-. Resta");
            System.out.println("0-. Salir");
            opcion = sc.nextInt();
        } while(opcion != 0);
    }
}
