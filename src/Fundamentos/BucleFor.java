
package Fundamentos;

public class BucleFor {

    public static void main(String[] args) {
        //Sirven para recorrer Arrays
        int[] arrayEnteros = {1, 2, 3, 4, 5};

        //System.out.print("Valores del for: ");

        /*for (int i=0; i <= 100; i++){
            if (i%2 == 0){
                System.out.println(i);
            }
        }*/

        for (int i= 0; i < arrayEnteros.length; i++){
            System.out.println(arrayEnteros[i]);
        }
    }
}
