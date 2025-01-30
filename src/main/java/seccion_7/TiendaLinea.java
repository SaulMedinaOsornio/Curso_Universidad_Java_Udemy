package seccion_7;
/*
 * Crear un sistema que ofrezca descuentos dependiendo del monto de la compra,
 * o si es miembro de la tienda.
 *
 * Se deben revisar las siguientes condiciones:
 *
 * 1. Si ha comprado más de $1,000 y es miembro → Descuento de 10%.
 * 2. Si sólo es miembro de la tienda → Descuento del 5%.
 * 3. Si no es miembro ni compró más de $1,000 → Descuento del 0%.
 */

import java.util.Scanner;

public class TiendaLinea {
    public static void main(String[] args) {

        //Instancias
        Scanner scanner = new Scanner(System.in);

        final double COMPRA_DESCUENTO = 0.05;
        final double MIEMBRO_DESCUENTO = 0.05;
        double total = 0;

        //Solicitamos la informacion
        System.out.print("Monto de compra $");
        double scannerCompra = scanner.nextDouble();

        System.out.print("Eres miembro? (true/false): ");
        boolean esMiembro = scanner.nextBoolean();

        //Evaluamos
        if (esMiembro && scannerCompra >= 1000) {
            total = scannerCompra - (scannerCompra * (COMPRA_DESCUENTO + MIEMBRO_DESCUENTO));
        } else if (esMiembro) {
            total = scannerCompra - (scannerCompra * MIEMBRO_DESCUENTO);
        } else {
            total = scannerCompra;
        }

        //Mostramos nuestro resultado
        System.out.printf("""
                Monto de compra: $%.2f)
                Total: $%.2f
                """, scannerCompra, total);
    }
}
