package clases;

public class Main {

    public static void main(String[] args) {

        //EJEMPLO DE COCHES
        Coche coche1 = new Coche();

        coche1.setModelo("Seat");
        coche1.setMatricula("1234JFG");
        coche1.setColor("Azul");
        coche1.setPotencia(90);
        //coche1.pintarInformacion();

        Coche coche2 = new Coche("4321BFG", "Toyota", "Azul", 90);
        coche2.pintarInformacion();

        //EJEMPLO DE CALCULADORA
        //Calculadora calc = new Calculadora();
        //calc.mostrarMenu();

        /* VAMOS A CREAR UN PERSONAJE
        Personaje prota = new Personaje();
        prota.setNombre("Alex");
        prota.saludar();
        prota.caminar();
        prota.correr();
        prota.detenerse();
        prota.saltar();
        prota.getNombre();*/
    }
}
