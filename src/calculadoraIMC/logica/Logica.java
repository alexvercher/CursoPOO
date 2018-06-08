/*
 */
package calculadoraIMC.logica;

import calculadoraIMC.persona.Persona;

public class Logica {

    public static void calcularIMC (Persona persona){
        // Recuperar peso y altura.
        double pesoPersona = persona.getPeso();
        double alturaPersona = persona.getAltura();
        //Hacer el cálculo del IMC. Peso(kg) / altura*altura (m)
        double imc = pesoPersona/(alturaPersona*alturaPersona);

        if (imc < 16){
            System.out.println("Tu IMC es de: " + imc + " obteniendo un rango de DESNUTRIDO SEVERO");
        }else if (imc < 18.5){
            System.out.println("Tu IMC es de: " + imc + " obteniendo un rango de DESNUTRIDO");
        }else if (imc < 25){
            System.out.println("Tu IMC es de: " + imc + " obteniendo un rango de NORMAL");
        }else if (imc < 30){
            System.out.println("Tu IMC es de: " + imc + " obteniendo un rango de SOBREPESO");
        }else{
            System.out.println("Tu IMC es de: " + imc + " obteniendo un rango de OBESIDAD");
        }
    }
}
