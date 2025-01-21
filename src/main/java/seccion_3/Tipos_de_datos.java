package seccion_3;

public class Tipos_de_datos {
    public static void main(String[] args) {
        //Sintaxis para definir variables
        //Tipo de dato
        String nombreVariable = "valor";

        //Tipos primitivos
        byte bitVariable = 123;
        short shortVariable = 32767;
        int numeroVariable = 10;
        long longVariable = 123456789L;

        double doubleVariable = 3.14;
        float floatVariable = 3.14F;

        boolean boolVariable = true;

        char charVariable = 'c';

        //Tipos Object (Referencia)
        String stringVariable = "valor";
        //Todos tipos de datos anteriores pueden ser ocupados
        //como referencia, char cambia completamente como Character

        //Ejemplo de como el valor cambia
        //Se asigna el valor
        int edad = 23;

        //Mostramos
        System.out.println("Edad: " + edad);

        //Cambiamos el valor
        edad = 20;

        //Mostramos
        System.out.println("Edad: " + edad);


        //Uso de var
        //var es bueno usarlo dentro de metodos en el mejor de los casos
        //var nombre = "Carlos"; infiere el tipo de dato


        //Concatenacion de cadenas
        String nombre = "nombre";
        String apellido = "apellido";
        System.out.println("Nombre completo: " + nombre + " " + apellido);

        //Sintaxis para definir constantes
        final int DIAS_SEMANA = 7;
        final double PI = 3.14159;
        final String MENSAJE_BIENVENIDA = "BIENVENIDA";
    }
}
