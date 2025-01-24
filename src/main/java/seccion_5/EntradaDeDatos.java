package seccion_5;

import java.util.Scanner;

public class EntradaDeDatos {
    public static void main(String[] args) {
        //Entrada de datos Scanner
        //Definimos la instancia del lector por consola Scanner
        var scanner = new Scanner(System.in); //in - input - Es la entrada standard de datos

        //Mandamos un mensaje al usuario por consola
        //Simulo una terminal de windows
        System.out.print("C:\\> ");

        //Agregamos a una variable la informacion ingresada por el usuario
        var query = scanner.nextLine();

        //Imprimimos un mensaje de salida
        System.out.print("C:\\> ");
        System.err.print("comando " + query +" no reconocido");


        //Lectura de tipos de datos
        //Lectura de tipos de dato numeric
        var numeroBy = scanner.nextByte();
        var numeroSh = scanner.nextShort();
        var numeroIn = scanner.nextInt();
        var numeroLo = scanner.nextLong();

        var numeroDo = scanner.nextDouble();
        var numeroFl = scanner.nextFloat();

        //En el caso de consumir cualquiera de estos tipos de llamada
        //es necesario mandar a llamar scanner.nextLine(); y posterior mente
        //ya puede ser ocupada como var nombre = scanner.nextLine();
        /*En el caso de no usar esto no se tomara en cuenta la llamada del dato por consola*/

        var palabra = scanner.nextLine();

        var condicional = scanner.hasNextBoolean();

        //Conversion de datos
        //Muestra el mensaje asi como la entrada de datos, cuando termina de ingresarlo
        //lo convierte a un numero entero, esto funciona con los tipos de datos anteriores
        System.out.println("Ingresa un numero entero: " + Integer.parseInt(scanner.nextLine()));
    }
}
