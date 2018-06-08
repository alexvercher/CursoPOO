
package Fundamentos;

public class BuclesAnidados {

    public static void main(String[] args) {

        // Tablas de multiplicar
        /*for (int i=1; i<=10;i++){
            System.out.println("Tabla del " + i);
            for (int j=1; j<=10;j++){
                int resultado = i * j;
                System.out.println(resultado);
            }
            System.out.println("-----------");
        }*/

        String[][] alumnos = new String [2][4];

        alumnos[0][0] = "234678A";
        alumnos[0][1] = "Alex";
        alumnos[0][2] = "Vercher";
        alumnos[0][3] = "Java";

        alumnos[1][0] = "234680B";
        alumnos[1][1] = "Juan";
        alumnos[1][2] = "Jose";
        alumnos[1][3] = "Cobol";

        /*for (int i=0; i<alumnos.length; i++){
            // Por cada alumno recorremos sus datos
            System.out.println("======");
            System.out.println("Alumno " + (i+1));
            for (int j=0; j<alumnos[i].length; j++) {
                System.out.println(alumnos[i][j]);
            }
        }*/

        for (String[] alumno : alumnos){
            System.out.println("======");
            for (String datos : alumno){
                System.out.println(datos);
            }
        }
    }
}
