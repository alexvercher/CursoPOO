
package calculadoraPOO.principal;

import calculadoraPOO.logica.Logica;

public class Main {

    public static void main(String[] args) {
        //Interface calculadora = new Interface();
        //calculadora.iniciar();

        int resultado = Logica.sumar(2,4);
        System.out.println("Resultado: " + resultado);
    }

}