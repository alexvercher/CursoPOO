
package Fundamentos;

public class Array {

    public static void main(String[] args) {

        // ARRAYS DE UNA DIMENSIÓN
        //un array es un objeto de java, que permite almacenar en su interior varios datos del mismo tipo
        int[] arrayEnteros = {1, 2, 3, 4, 5};
        System.out.println("El valor de la posición 0 es " + arrayEnteros[0]);

        String[] arrayString = new String [7];
        arrayString[0] = "Lunes";
        arrayString[1] = "Martes";
        arrayString[2] = "Miércoles";
        arrayString[3] = "Jueves";
        arrayString[4] = "Viernes";
        arrayString[5] = "Sábado";
        arrayString[6] = "Domingo";

        System.out.println(arrayString[2]);

        //ARRAYS DE DOS DIMENSIONES - Matrices
        int [][] array2D = new int[2][5];
        array2D[0][0] = 0;
        array2D[0][1] = 1;
        array2D[0][2] = 2;
        array2D[0][3] = 3;
        array2D[0][4] = 4;

        array2D[1][0] = 5;
        array2D[1][1] = 6;
        array2D[1][2] = 7;
        array2D[1][3] = 8;
        array2D[1][4] = 9;

        System.out.println("===========");
        System.out.println(array2D[0][4]);
        System.out.println(array2D[1][1]);
    }

}
