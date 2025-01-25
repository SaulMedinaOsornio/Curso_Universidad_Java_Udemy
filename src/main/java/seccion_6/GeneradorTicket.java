package seccion_6;

import java.util.Scanner;

/*
 * Generacion Ticket Venta
 *
 * Supongamos que compramos varios articulos
 * en el mercado y queremos obtener el
 * ticket de venta total incluyendo
 * impuestos.
 *
 * El sistema solicitara el precio de cada
 * producto a comprar y el usuario
 * debera indicar su precio (Valor de tipo
 * con punto decimal).
 *
 * El sistema debe realizar la suma
 * de cada producto calcular el impuesto
 * y finalmente imprimir el total de la compra.
 */
public class GeneradorTicket {
    public static void main(String[] args) {
        //Instanciamos los objetos
        Scanner scanner = new Scanner(System.in);
        final float IVA = 0.16f;

        //Solicitamos la informacion
        System.out.print("Ingrese el precio del pan: ");
        double precioPan = scanner.nextDouble();

        System.out.print("Ingrese el precio del azúcar: ");
        double precioAzucar = scanner.nextDouble();

        System.out.print("Ingrese el precio del pollo: ");
        double precioPollo = scanner.nextDouble();

        System.out.print("Ingrese el precio del filete: ");
        double precioFilete = scanner.nextDouble();

        System.out.print("Ingrese el precio del vino: ");
        double precioVino = scanner.nextDouble();

        System.out.print("Inserta un descuento (%): ");
        double descuento = scanner.nextDouble();

        //Evaluamos la cantidad de los productos
        double subtotal = precioPan + precioAzucar + precioPollo + precioFilete + precioVino;

        //Calcular descuento
        descuento = (descuento /100) * subtotal;

        //Calculamos el impuesto del 16%
        double impuestos = subtotal * IVA;

        //Calculamos el total
        double total = impuestos + subtotal - descuento;

        System.out.printf("""
                --------------TICKET----------------
                pan = $%.2f
                azucar = $%.2f
                pollo = $%.2f
                filete = $%.2f
                vino = $%.2f
                Subtotal = $%.2f
                Descuento = -$%.2f
                Impuestos (16%%) = $%.2f
                Total = $%.2f
                ------------------------------------
                """, precioPan, precioAzucar, precioPollo, precioFilete, precioVino, subtotal, descuento, impuestos, total);
    }
}
