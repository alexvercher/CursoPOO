
package clases;

public class Coche {
    //Atributos locales
    private String matricula;
    private String modelo;
    private int potencia;
    private String color;

    //Constructor por defecto
    public Coche(){
        matricula = "6589FLD";
        modelo = "Renault";
        potencia = 0;
        color = "Desconocido";
    }
    //Constructor al cual le paso parámetros inicializadores
    public Coche (String mat, String mod, String col, int pot){
        matricula = mat;
        modelo = mod;
        potencia = pot;
        color = col;
    }

    //Métodos SETTERS
    public void setMatricula(String mat){
        matricula = mat;
    }
    public void setModelo(String mod){
        modelo = mod;
    }
    public void setPotencia(int pot){
        potencia = pot;
    }
    public void setColor(String col){
        color = col;
    }

    public void pintarInformacion(){
        System.out.println("INFORMACIÓN COCHE");
        System.out.println("=================");
        System.out.println("Matrícula: " + matricula);
        System.out.println("Modelo: " + modelo);
        System.out.println("Potencia: " + potencia);
        System.out.println("Color: " + color);
    }
}
