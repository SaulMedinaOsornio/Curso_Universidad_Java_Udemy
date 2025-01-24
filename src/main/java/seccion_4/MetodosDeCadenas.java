package seccion_4;

public class MetodosDeCadenas {
    public static void main(String[] args) {
        //Metodos de cadenas
        var holaMundo = "Hola Mundo";

        //Longitud de una cadena
        System.out.println("Longitud de la cadena: " + holaMundo.length());

        //Remplazar datos de la cadena
        System.out.println("Remplazar o por u: " + holaMundo.replace("o", "u"));

        //Convertir a mayúsculas
        System.out.println("Convertida a mayúsculas: " + holaMundo.toUpperCase());

        //Convertir a minusculas
        System.out.println("Convertida a minusculas: " + holaMundo.toLowerCase());

        //Cortar los espacios innecesarios de una cadena, mas especifico el inicio y el final
        var nombreConEspacios = "   Carlos Alberto Garcia  ";
        System.out.println("Sin espacios al inicio y al final: " + nombreConEspacios.trim());

        //Subcadenas
        //Sub cadena con inicio y final declarado
        System.out.println("Recorta Hola: " + holaMundo.substring(0,4));

        //Sub cadena con inicio declarado pero final inferido
        System.out.println("Recorta Mundo: " + holaMundo.substring(5));

        //Indices index of
        //Devuelve el indice donde se encontró la primera letra de la palabra
        System.out.println("Primer Indice de la palabra: " + holaMundo.indexOf("Ho"));

        //Devuelve el indice donde se encontró la ultima letra de la palabra
        System.out.println("Ultimo Indice de la palabra: " + holaMundo.lastIndexOf("o"));

        //Sino encuentra la palabra o letra manda un -1
        System.out.println("No encontrada: " + holaMundo.indexOf("Java"));

        //Remplazar sub cadenas
        System.out.println("Remplazando la palabra Hola: " + holaMundo.replace("Hola", "Este es el"));
    }
}
