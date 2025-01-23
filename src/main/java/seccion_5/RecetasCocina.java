package seccion_5;
// Recetas de Cocina
// Programa para solicitar los valores más importantes de una receta de cocina.

// Los valores que debe introducir el usuario son:
// - Nombre de la Receta (String)
// - Ingredientes principales (String)
// - Tiempo de preparación en minutos (int)
// - Dificultad ("Fácil", "Media", "Alta") (String)

import java.util.Scanner;

// Al finalizar, se debe mandar a imprimir la receta.
public class RecetasCocina {
    public static void main(String[] args) {

        //Instancia mos el objeto Scanner
        var scanner = new Scanner(System.in);

        //Pedimos la informacion al usuario y la ingresamos a una variable
        System.out.print("Nombre de la receta: ");
        var nombreReceta = scanner.nextLine();

        System.out.print("Ingredientes principales: ");
        var ingredientesPrincipales = scanner.nextLine();

        System.out.print("Tiempo de preparacion en minutos: ");
        var tiempoPreparacion = scanner.nextInt();

        System.out.print("Nivel de dificultad (\"Fácil\", \"Media\", \"Alta\"): ");
        scanner.nextLine();
        var nivelDificultad = scanner.nextLine();

        //Imprimimos la informacion
        System.out.println("\nReceta de cocina");
        System.out.println("\tNombre de la receta: " + nombreReceta);
        System.out.println("\tIngredientes principales: " + ingredientesPrincipales);
        System.out.println("\tTiempo de preparacion: " + tiempoPreparacion + " minutos");
        System.out.println("\tNivel de dificultad: " + nivelDificultad);
    }
}
