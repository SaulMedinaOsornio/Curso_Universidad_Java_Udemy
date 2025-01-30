package seccion_7;
/*
 * Sistema de Calificaciones
 *
 * Crear un programa para convertir una calificación numérica (entre 0 y 10) a una letra (de la F a la A).
 *
 * Las condiciones son las siguientes:
 * - Si es mayor o igual a 9 y menor o igual a 10 → A
 * - Si es mayor o igual a 8 y menor a 9 → B
 * - Si es mayor o igual a 7 y menor a 8 → C
 * - Si es mayor o igual a 6 y menor a 7 → D
 * - Si es mayor o igual a 0 y menor a 6 → F
 *
 * En otro caso, imprimir: "?"
 */

import java.util.Scanner;

public class SistemaCalificaciones {
    public static void main(String[] args) {

        //Instancia
        Scanner scanner = new Scanner(System.in);

        //Solicitamos la informacion
        System.out.print("Ingrese una calificación entre el 0 y 10: ");
        int calificacion = scanner.nextInt();

        //Evaluamos y asignamos
        char calificacionLetra;

        calificacionLetra = switch (calificacion) {
            case 10, 9 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            case 6 -> 'D';
            case 5, 4, 3, 2, 1, 0 -> 'F';
            default -> '?';
        };

        //Mostramos el resultado
        System.out.println("Tu calificacion " + calificacion + " en letra es " + calificacionLetra);
    }
}
