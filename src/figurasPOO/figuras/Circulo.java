/*
 * Esta clase definirá las operaciones sobre un círculo.
 * Recibira un argumento de entrada (radio) y debe calcular el área y el perímetro.
 *
 * Atributos locales --> radio, área, perímetro
 * Métodos de la clase --> Calcular área y calcular perímetro.
 *
 * área = PI*radio al cuadrado
 * perímetro = 2*PI*radio
 */

package figurasPOO.figuras;

public class Circulo {
    //Atributos locales de la clase
    private double area;
    private double perimetro;
    private double radio;

    //Constructor que inicialice la variable radio
    public Circulo(double rad){
        radio = rad;
    }

    //Métodos de cálculo
    public double calcularArea(){
        area = 0;
        area = Math.PI * (radio * radio);
        return area;
    }

    public double calcularPerimetro(){
        perimetro = 0;
        perimetro = 2 * radio * Math.PI;
        return perimetro;
    }
}
