package seccion_7;
/*
 * Sistema Bancario
 *
 * Considerando que estamos dentro de un sistema bancario, se solicita preguntar al
 * usuario si desea continuar dentro del sistema.
 *
 * Utilizando el operador NOT (!) para aplicar una lógica inversa, se debe programar
 * las siguientes condiciones:
 *
 * - Si NO deseamos salir del sistema, imprimir: "Continuamos dentro del sistema."
 * - De lo contrario, imprimir: "Saliendo del sistema..."
 */

import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {

        //Instancias
        Scanner scanner = new Scanner(System.in);

        //Solicitamos informacion
        System.out.println("----Ingrese al sistema Bancario----");
        System.out.print("Deseas salir del sistema Bancario? (true/false): ");
        boolean salir = scanner.nextBoolean();

        if (!salir) {
            System.out.println("Continuamos dentro del sistema.");
        } else {
            System.out.println("Saliendo del sistema...");
        }
    }
}
