/*
 * Crear un array con las notas de un alumno.
 * Mostrar la media y que pinte una calificación.
 * 0 - 4.9 --> Insuficiente
 * 5 - 5.9 --> Suficiente
 * 6 - 6.9 --> Bien
 * 7 - 8.9 --> Notable
 * 9 - 10  --> Sobresaliente
 */
package ejercicios;

public class Ejercicio06 {

    public static void main(String[] args) {
        double[] notas = {9, 8, 7, 9, 10, 8};
        double suma = 0;
        double notaMedia = 0;

        for (double nota : notas) {
            suma += nota;
        }

        notaMedia = suma / notas.length;

        // Estructura if
        if (notaMedia < 5) {
            System.out.println("Insuficiente: " + notaMedia);
        } else if (notaMedia < 6) {
            System.out.println("Suficiente: " + notaMedia);
        } else if (notaMedia < 7) {
            System.out.println("Bien: " + notaMedia);
        } else if (notaMedia < 9) {
            System.out.println("Notable: " + notaMedia);
        } else {
            System.out.println("Sobresaliente: " + notaMedia);
        }

        //Estructura switch
        // CASTING: Conversión de un dato tipo double o float a un int
        int notaEntero = (int) notaMedia;
        switch (notaEntero) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("La nota media es INSUFICIENTE: " + notaMedia);
                break;
            case 5:
                System.out.println("La nota media es SUFICIENTE: " + notaMedia);
                break;
            case 6:
                System.out.println("La nota media es BIEN: " + notaMedia);
                break;
            case 7:
            case 8:
                System.out.println("La nota media es NOTABLE: " + notaMedia);
                break;
            case 9:
            case 10:
                System.out.println("La nota media es SOBRESALIENTE: " + notaMedia);
                break;
        }
    }
}
