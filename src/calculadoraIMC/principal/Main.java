package calculadoraIMC.principal;

import java.util.Scanner;

import calculadoraIMC.logica.Logica;
import calculadoraIMC.persona.Persona;

public class Main {

    public static void main(String[] args) {
        //Atributos
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        //1a opción: Crear una persona vacía y añadir sus valores
        //Persona usuario = new Persona();
        //2a opción: Crear variables auxiliares
        String nombre;
        String apellido;
        int edad;
        double peso, altura;

        //Menú
        System.out.println("CALCULADORA IMC JAVA");
        System.out.println("====================");
        System.out.println(" ");
        System.out.print("Introduce tu nombre: ");
        //usuario.setNombre(sc.nextLine());
        nombre = sc.nextLine();
        System.out.print("Introduce tu apellido: ");
        //usuario.setApellidos(sc.nextLine());
        apellido = sc.nextLine();
        System.out.print("Introduce tu edad: ");
        //usuario.setEdad(sc.nextInt());
        edad = sc.nextInt();
        System.out.print("Introduce tu peso en kg: ");
        //usuario.setPeso(sc.nextDouble());
        peso = sc.nextDouble();
        System.out.print("Introduce tu altura en metros: ");
        //usuario.setAltura(sc.nextDouble());
        altura = sc.nextDouble();

        Persona persona = new Persona(nombre, apellido, edad, altura, peso);

        System.out.println(" ");
        System.out.println("====================");
        System.out.println("Qué quieres hacer " + nombre + "?");
        System.out.println("1. Calcular tu IMC");
        System.out.println("0. Salir");
        opcion = sc.nextInt();

        System.out.println(" ");
        System.out.println("====================");

        if (opcion != 0){
            Logica.calcularIMC(persona);
        }else{
            System.out.println("hasta luego lucas");
        }
    }
}
