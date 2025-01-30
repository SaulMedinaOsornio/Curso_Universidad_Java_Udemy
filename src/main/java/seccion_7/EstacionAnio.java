package seccion_7;
/*
 * Identificación de la Estación del Año
 *
 * Se debe identificar la estación del año según el mes proporcionado (1-12).
 *
 * La asociación de meses a estaciones es la siguiente:
 * - Meses 1, 2 o 12 → Invierno
 * - Meses 3, 4 o 5 → Primavera
 * - Meses 6, 7 u 8 → Verano
 * - Meses 9, 10 u 11 → Otoño
 *
 * Cualquier otro valor → Estación Desconocida
 */

import java.util.Scanner;

public class EstacionAnio {
    public static void main(String[] args) {

        //Instancia
        Scanner scanner = new Scanner(System.in);

        //solicitamos la informacion
        System.out.print("Ingrese el estacion anio: ");
        int estacionAnio = scanner.nextInt();

        //Evaluamos
        String estacionMensaje = "";
        if ((estacionAnio == 1 || estacionAnio == 2) || estacionAnio == 12) {
            estacionMensaje = "Invierno";
        } else if (estacionAnio >= 3 && estacionAnio <= 5) {
            estacionMensaje = "Primavera";
        } else if (estacionAnio >= 6 && estacionAnio <= 8) {
            estacionMensaje = "Verano";
        } else if (estacionAnio >= 9 && estacionAnio <= 11) {
            estacionMensaje = "Otoño";
        } else {
            estacionMensaje = "No es una estacion";
        }

        //Mostramos la informacion
        System.out.print("La estacion del año " + estacionAnio + " es " + estacionMensaje + ".");

        //Estacion año mejorada

        //solicitamos la informacion
        System.out.print("\nIngrese el estacion anio: ");
        estacionAnio = scanner.nextInt();

        //Evaluamos con la estructura switch arrow
        estacionMensaje = switch (estacionAnio) {
            case 12, 1, 2 -> "Invierno";
            case 3, 4, 5 -> "Primavera";
            case 6, 7, 8 -> "Verano";
            case 9, 10, 11 -> "Otoño";
            default -> "No es una estacion";
        };
        System.out.print("SW ->: La estacion del año " + estacionAnio + " es " + estacionMensaje + ".");
    }
}
