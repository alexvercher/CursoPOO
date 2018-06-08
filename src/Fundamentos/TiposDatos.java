package Fundamentos;

public class TiposDatos {

    public static void main(String[] args) {

        // Definición de variables con asignación de valores
        int entero = 0;
        float comaFlotante = 1.15f; //Añadir 'f' al final para floats
        double decimal = 1.359;
        long entroGranCapacidad = 122222200;
        char caracter = 'c';
        boolean buleano = true; //Solo true o false

        String cadenaCaracteres = "Esto es una cadena de caracteres";

        entero = 2;

        System.out.println(entero);
        System.out.println(comaFlotante);
        System.out.println(decimal);
        System.out.println(entroGranCapacidad);
        System.out.println(caracter);
        System.out.println(buleano);
        System.out.println(cadenaCaracteres);

        //Operaciones matemáticas
        System.out.println("===================================");
        System.out.println(comaFlotante + 1.15f);
        System.out.println(comaFlotante - 0.15f);
        System.out.println(decimal * 5);
        System.out.println(comaFlotante / 1.15f);
        System.out.println(comaFlotante % 1.10f);

        //Signos de comprobación
        System.out.println("===================================");
        System.out.println("SIGNOS DE COMPARACIÓN");
        System.out.println(entero > decimal);
        System.out.println(entroGranCapacidad < decimal);

        //Concatenar datos
        System.out.println("El valor entero es " + entero + " y el valor de decimal es " + decimal);
    }

}