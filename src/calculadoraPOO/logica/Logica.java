
package calculadoraPOO.logica;

public class Logica {

    //Suma
    public static int sumar(int numA, int numB) {
        //Reglas de buena programación. Siempre que tengamos un método con 
        //devolución, creamos una variable interna de ese tipo y insertamos la
        //cláusula return devolviendo este dato        
        int resultado = 0;
        resultado = numA + numB;
        return resultado;
    }

    //Resta
    public static int restar(int numA, int numB) {
        int resultado = 0;
        resultado = numA - numB;
        return resultado;
    }

    //Multiplicación
    public static int multiplicar(int numA, int numB) {
        int resultado = 0;
        resultado = numA * numB;
        return resultado;
    }

    //División
    public static int dividir(int numA, int numB) {
        int resultado = 0;
        resultado = numA / numB;
        return resultado;
    }
}