/*
 * Esta clase se va a encargar de crear el objeto círculo, inicializándolo
 * con el radio, y pintará por pantalla los resultados del área y del
 * perímetro.
 */
package figurasPOO;

import figurasPOO.figuras.Circulo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Variables a utilizar
        Scanner sc = new Scanner(System.in);
        double radio;
        double perimetro;
        double area;

        //Mostrar el menú de la aplicación
        do {
            System.out.println("**** CÁLCULO DE AREA Y PERIMETRO ****");
            System.out.println("=====================================");
            System.out.println("");
            System.out.print("Introduce el radio del círculo, o entra 0 para salir: ");
            radio = sc.nextDouble();

            if (radio != 0) {
                //Creamos el círculo
                Circulo circulo = new Circulo(radio);
                //Calculamos el área y el perímetro
                area = circulo.calcularArea();
                perimetro = circulo.calcularPerimetro();
                //Resultado
                System.out.println("El área del círculo es: " + area);
                System.out.println("El perímetro del círculo es: " + perimetro);
            }

        } while (radio != 0);
    }

}
