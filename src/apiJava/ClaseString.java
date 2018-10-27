package apiJava;

public class ClaseString {

    public static void main(String[] args) {

        String cadena = "Mi cadena de caracteres";
        String cadena2 = new String("Mi cadena de caracteres 2");
  

        int tamano = cadena.length(); // Tamaño del string (Número de caracteres)
        System.out.println(tamano);

        //.charAt(int pos) --> Devuelve el carácter que hay en una posición dada
        char c = cadena2.charAt(1);
        System.out.println(c);

        //.indexOf(String cad) --> Posición de ese carácter o cadena. Si no encuentra devuelve -1
        String mail = "alexvercher@gmail.com";
        System.out.println(mail.indexOf("@"));

        //.indexOf(String cad, int pos) --> Dada la posición de inicio, busca el carácter dado
        //Si no encuentra devuelve -1
        System.out.println("La letra a se encuentra: " + mail.indexOf("b",5));

        //.lastIndexOf() --> Última posición de un carácter en una cadena
        System.out.println("La letra o se encuentra en la ultima posición en: " + mail.lastIndexOf("o"));

        //.lastIndexOf(String cad, int pos) --> Última posición de un carácter dada una posición inicial
        // y el carácter buscado
        System.out.println("La letra o se encuentra en la ultima posición en: " + mail.lastIndexOf("e",5));

        //.substring(int pos1, int pos2) --> Devuelve un string con el trozo de cadena comprendido
        // entre las posiciones dadas
        System.out.println(mail.substring(2, 9));
        System.out.println(mail.substring(0,mail.indexOf("@")));

        //.split(String cad) --> Devuelve un array con los trozos de cadena resultantes de usar
        // la cadena de entrada como separador
        String[] array = cadena2.split(" ");
        for (String e : array){
            System.out.println(e);
        }

        //.trim --> Elimintar los espacios en blanco de una cadena de caracteres al inicio y al final
        String nuevacadena = "           Esto es una cadena de espacios en blanco   ";
        System.out.println(nuevacadena);
        System.out.println(nuevacadena.trim());

        //.replace(String cad1, String cad2) --> Reemplazar una cadea por otra
        System.out.println(nuevacadena.replace("a", "o"));

        //.valueOf --> Tipo primitivo valor. Devuelve un String
        String valor = String.valueOf(12345);
        System.out.println("Valor: " + valor);

        //PARSEOS - Clases de envoltura
        int numero = Integer.parseInt(valor);
        double decimal = Double.parseDouble(valor);
        System.out.println(numero);
        System.out.println(decimal);
    }
}
