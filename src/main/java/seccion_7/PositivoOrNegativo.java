package seccion_7;
//En este ejercicio se solicita un numero
//Si este es mayor a cero imprimir es positivo
//Si este es menor a cero validar si es menor
//Mandar mensaje de, es negativo y si es 0 mandar mensaje de que es cero.

import java.util.Scanner;

public class PositivoOrNegativo {
    public static void main(String[] args) {

        //Instanciamos
        Scanner scanner = new Scanner(System.in);

        //Solicitamos la informacion
        System.out.print("Ingresa un numero: ");
        int scannerNumber = scanner.nextInt();

        //Evaluamos la condicion if else
        if (scannerNumber > 0) {
            System.out.print("El numero " + scannerNumber + " es positivo");
        } else if (scannerNumber < 0) {
            System.out.print("El numero " + scannerNumber + " es negativo");
        } else {
            System.out.print("El numero es cero");
        }

    }
}
