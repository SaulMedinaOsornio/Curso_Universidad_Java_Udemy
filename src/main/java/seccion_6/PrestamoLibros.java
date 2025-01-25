package seccion_6;
/*
 * Sistema Préstamo de Libros
 *
 * Se pide crear un sistema para una biblioteca, la cual desea prestar libros
 * si cumple con cualquiera de las siguientes condiciones:
 *
 * 1. El usuario tiene credencial de estudiante.
 * 2. El usuario vive a no más de 3 km a la redonda.
 *
 * Si cumple con cualquiera de estas condiciones, se le puede prestar el libro.
 */

import java.util.Scanner;

public class PrestamoLibros {
    public static void main(String[] args) {

        //Instanciamos los objetos
        Scanner scanner = new Scanner(System.in);
        final int LIMITE_DISTANCIA_KM = 3;

        //Obtenemos la informacion
        System.out.print("Tienes credencial de estudiante? (true/false): ");
        boolean esEstudiante = scanner.nextBoolean();

        System.out.print("Aque distancia vives (en KM): ");
        int distanciaKm = scanner.nextInt();

        //Evaluamos la informacion
        boolean seLePuedePrestar = esEstudiante || distanciaKm <= LIMITE_DISTANCIA_KM;

        //Imprimimos el resultado
        System.out.println("Se le puede prestar? " + seLePuedePrestar);
    }
}
