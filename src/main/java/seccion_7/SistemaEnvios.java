package seccion_7;
/*
 * Costo de Envío de Paquetes
 *
 * Crea un programa para determinar el costo de envío de un paquete según el destino (nacional o internacional) y el peso del paquete.
 *
 * Costo Tarifas:
 * - Nacional = 10 x Kilo
 * - Internacional = 20 x Kilo
 *
 * El programa debe solicitar 2 valores:
 * 1. Destino (nacional o internacional)
 * 2. Peso (kilogramos) del paquete
 *
 * Al final, debe imprimir el costo de envío del paquete.
 */

import java.util.Scanner;

public class SistemaEnvios {
    public static void main(String[] args) {

        //Instancia
        Scanner scanner = new Scanner(System.in);

        //Constantes
        final double PRECIO_NACIONAL_KILO = 10;
        final double PRECIO_INTERNACIONAL_KILO = 20;

        //Solicitamos la informacion
        System.out.println("---- Sistema de envios ----");
        System.out.print("Ingrese El tipo de destino (Nacional/Internacional): ");
        String tipoDestino = scanner.nextLine();

        System.out.print("Ingresa el peso del paquete en Kilogramos: ");
        double pesoPaquete = scanner.nextDouble();

        //Evaluamos
        Double costoTarifa = switch (tipoDestino) {
            case "Nacional" -> pesoPaquete * PRECIO_NACIONAL_KILO;
            case "Internacional" -> pesoPaquete * PRECIO_INTERNACIONAL_KILO;
            default -> {
                System.err.println("No se puede reconocer el tipo de destino.");
                yield null;
            }
        };

        //Mostramos el resultado
        if (costoTarifa != null) {
            System.out.printf("""
                    --- Ticket ---
                    Tipo de destino: %s
                    El peso del paquete es: %.2f Kilogramos
                    Tarifa del paquete: $%.2f
                    --------------
                    """, tipoDestino, pesoPaquete, costoTarifa);
        }
    }
}
