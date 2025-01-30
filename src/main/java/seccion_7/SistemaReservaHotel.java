package seccion_7;
/*
 * Sistema de Reserva de Hotel
 *
 * Se solicita crear un sistema de reservación de un hotel. Se debe pedir la siguiente información al usuario:
 * - Nombre del Cliente
 * - Días de estadía en el hotel
 * - ¿Cuarto con vista al mar?
 *
 * El hotel tiene las siguientes tarifas:
 * - Cuarto sin vista al mar: $150.50 por día
 * - Cuarto con vista al mar: $140.50 por día
 *
 * El sistema debe calcular el costo total de la estadía dependiendo de si escogió un cuarto con vista al mar o no.
 * Además, debe indicar si escogió un cuarto con vista al mar o no.
 */

import java.util.Scanner;

public class SistemaReservaHotel {
    public static void main(String[] args) {

        //Instancias
        Scanner scanner = new Scanner(System.in);

        //Constantes
        final double PRECIO_CUARTO_VISTA_AL_MAR = 150.50;
        final double PRECIO_CUARTO_SIN_VISTA_AL_MAR = 140.50;

        //Solicitamos la informacion
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Dias estancia: ");
        int diasEstancia = scanner.nextInt();

        System.out.print("Cuarto con vista al mar? (true/false): ");
        boolean cuartoConVista = scanner.nextBoolean();

        //Evaluamos
        double costoTotalEstadia = cuartoConVista ? (diasEstancia * PRECIO_CUARTO_VISTA_AL_MAR) : (diasEstancia * PRECIO_CUARTO_SIN_VISTA_AL_MAR);

        //Mostramos la informacion
        System.out.printf("""
                Hola %s
                Tu estancia de %d dias y vista al mar? %b
                Total = $%.2f
                """, nombre, diasEstancia, cuartoConVista, costoTotalEstadia);
    }
}
