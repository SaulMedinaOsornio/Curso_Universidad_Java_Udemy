package seccion_7;
/*
 * El Mayor de 2 Números
 *
 * Cree un programa que determine el mayor de dos números.
 *
 * El programa debe:
 * - Pedir al usuario dos números enteros.
 * - Comparar los dos números y determinar cuál es el mayor.
 * - Mostrar el número mayor.
 */
import java.util.Scanner;

public class MayorNumeros {
    public static void main(String[] args) {

        //Instancia
        Scanner scanner = new Scanner(System.in);

        //Solicitamos la informacion
        System.out.print("Ingrese el numero 1: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el numero 2: ");
        int numero2 = scanner.nextInt();

        //Evaluamos la expresion

        String mensaje = numero1 > numero2? "El primer numero es mayor" : numero1 == numero2? "Los numeros son iguales" : "El segundo numero es mayor";

        //Mostramos el resultado
        System.out.print("Cuales es el numero mayor? " + mensaje);
    }
}
