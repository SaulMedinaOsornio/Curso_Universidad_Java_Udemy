package seccion_4;

public class ManejoIndices {
    public static void main(String[] args) {
        // Los índices de una cadena en Java están indexados de manera secuencial,
        // comenzando desde 0 hasta la longitud de la cadena menos uno, es decir,
        // el primer carácter está en el índice 0 de la cadena, y el último carácter
        // en el índice n-1, siendo n el largo de la cadena.

        //Declaramos la referencia
        var holaMundo = "Hola Mundo";

        // Largo Cadena: n = 10
        int largoCadena = holaMundo.length();

        // Primer carácter: charAt(0) -> 'H'
        var primerCaracter = holaMundo.charAt(0);

        // Último carácter: charAt(9) -> 'o'
        var ultimoCaracter = holaMundo.charAt(holaMundo.length() - 1);

        //Imprimimos todos los resultados
        System.out.println("Largo de la cadena: " + largoCadena);
        System.out.println("Priomer caracter: " + primerCaracter);
        System.out.println("Ultimo caracter: " + ultimoCaracter);

        //Practica imprime la 'M'
        var m = holaMundo.charAt(5);
        System.out.println("M caracter: " + m);
    }
}
