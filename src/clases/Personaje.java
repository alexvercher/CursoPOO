
package clases;

//Clase
public class Personaje {

    //Atributos - Variables
    String nombre;
    int vida;
    boolean haceMagia;


    //Métodos - Funciones
    public void saludar (){
        System.out.println("Hola, me llamo " + nombre);
    }

    public void caminar (){
        System.out.println("Estoy caminando...");
    }

    public void detenerse (){
        System.out.println("Ok, me detengo...");
    }

    public void correr (){
        System.out.println("Voy corriendo!!...");
    }

    public void saltar (){
        System.out.println("Qué alto salto!!...");
    }

    //Métodos GET y SET
    public void setNombre(String name){
        nombre = name;
    }

    public String getNombre(){
        return nombre;
    }

}
