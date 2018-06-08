/*
 * Diseñar la interfaz gráfica de la aplicación
 */
package calculadoraPOO.userInterface;

import java.util.Scanner;
import calculadoraPOO.logica.Logica;

public class Interfaz {

    private int opcion = 0;
    private Scanner sc = new Scanner(System.in);
    private int numA = 0;
    private int numB = 0;
    private int resultado = 0;
    //private Logica logica = new Logica();

    //Métodos propios de la clase interfaz
    public void iniciar() {
        mostrarMenu();
    }

    private void mostrarMenu() {
        System.out.println("POO CALCULADORA JAVA 2018");
        System.out.println("=========================");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("0. Salir");
        System.out.println("=========================");
        getOpcion();
    }

    private void getOpcion() {
        do {
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 0:
                    System.out.println("Gracias por usar la calculadora");
                    System.out.println("Hasta pronto!!");
                    break;
                case 1:
                    getNumeros();
                    resultado = Logica.sumar(numA, numB);
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                case 2:
                    getNumeros();
                    resultado = Logica.restar(numA, numB);
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;
                case 3:
                    getNumeros();
                    resultado = Logica.multiplicar(numA, numB);
                    System.out.println("El resultado de la multiplicación es: " + resultado);
                    break;
                case 4:
                    getNumeros();
                    resultado = Logica.dividir(numA, numB);
                    System.out.println("El resultado de la división es: " + resultado);
                    break;
                default:
                    System.out.println("La opción elegida incorrecta");
                    break;
            }
        } while (opcion != 0);
    }

    private void getNumeros() {
        System.out.print("Introduce el primer numerando: ");
        numA = sc.nextInt();
        System.out.print("Introduce el segundo numerando: ");
        numB = sc.nextInt();
    }
}
