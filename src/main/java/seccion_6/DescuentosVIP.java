package seccion_6;
/*
 * Sistema Descuentos VIP
 *
 * Una tienda de supermercado ofrece un descuento especial a clientes que compren
 * 10 o más artículos por día Y además sean miembros de la tienda.
 *
 * El sistema debe solicitar al cliente que indique cuántos artículos ha comprado
 * en el día y preguntarle si cuenta con la membresía de la tienda.
 *
 * En caso de haber comprado 10 o más productos y ser miembro de la tienda,
 * entonces tendrá acceso al descuento VIP.
 */

import java.util.Scanner;

public class DescuentosVIP {
    public static void main(String[] args) {

        //Instanciamos los datos
        Scanner scanner = new Scanner(System.in);
        final int LIMITE_PRODUCTOS = 10;

        //Obtenemos la informacion
        System.out.print("Ingrese la cantidad de productos: ");
        int cantidad = scanner.nextInt();

        System.out.print("Tiene membresía? (true/false): ");
        boolean esMiembro = scanner.nextBoolean();

        //Evaluamos la informacion
        boolean validoDescuento = esMiembro && cantidad >= LIMITE_PRODUCTOS;

        //Mostramos el resultado
        System.out.print("Es acreedor a un descuento? (true/false): " + validoDescuento);
    }
}
