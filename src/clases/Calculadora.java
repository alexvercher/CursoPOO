
package clases;

//Import de las clsaes necesarias que no pertenecen al mismo paquete
import java.util.Scanner;

public class Calculadora {

    //Variables locales (Accesibles desde toda la clase)
    Scanner sc = new Scanner(System.in);
    int resultado = 0;
    int num1 = 0;
    int num2 = 0;

    /* Funciones de nuestra calculadora
        1- Mostrar menú
        2- Sumar
        3- Restar
        4- Multiplicar
        5- Dividir
    */

    public void mostrarMenu (){
        //Variables internas del método, accesibles solo desde el método
        int opcion = 0;


        System.out.println("CALCULADORA 2020");
        System.out.println("================");

        do {
            System.out.println("1- Sumar");
            System.out.println("2- Restar");
            System.out.println("3- Multiplicar");
            System.out.println("4- Dividir");
            System.out.println("0- Salir");
            System.out.println("================");

            System.out.print("Selecciona la peración: ");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    sumar();
                    break;
                case 2:
                    restar();
                    break;
                case 3:
                    multiplicar();
                    break;
                case 4:
                    dividir();
                    break;
                case 0:
                    System.out.println("Hasta luego!!!");
                    break;
                default:
                    System.out.println("La opción seleccionada no es válida");
            }
        } while (opcion != 0);
    }

    public void recogerDatos(){
        System.out.print("Introduce pimer número: ");
        num1 = sc.nextInt();
        System.out.print("Introduce segundo número: ");
        num2 = sc.nextInt();
    }
    public void sumar (){
        recogerDatos();
        System.out.println("El resultado de la suma es: " + (num1+num2));
    }
    public void restar (){
        recogerDatos();
        System.out.println("El resultado de la resta es: " + (num1-num2));
    }
    public void multiplicar (){
        recogerDatos();
        System.out.println("El resultado de la multiplicación es: " + (num1*num2));
    }
    public void dividir (){
        recogerDatos();
        System.out.println("El resultado de la suma es: " + (num1/num2));
    }
}

