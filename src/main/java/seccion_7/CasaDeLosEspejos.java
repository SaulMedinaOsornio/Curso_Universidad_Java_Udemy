package seccion_7;
/*
 * Casa de los Espejos
 *
 * Supón que estás en un parque de diversiones y quieres entrar
 * a la casa de los espejos. Sin embargo, debes cumplir con algunas condiciones:
 *
 * 1. Debes tener más de 10 años.
 * 2. No debe darte miedo la oscuridad.
 *
 * Si se cumplen las condiciones anteriores, puedes entrar.
 *
 * Para realizar este ejemplo, vamos a utilizar el operador NOT (!).
 */

import java.util.Scanner;

public class CasaDeLosEspejos {
    public static void main(String[] args) {

        //Instancias
        Scanner scanner = new Scanner(System.in);

        //Obtenemos la informacion
        System.out.print("Cuantos años tienes? ");
        int edad = scanner.nextInt();

        System.out.print("Te da miedo la obscuridad? (true/false): ");
        boolean tieneMiedo = scanner.nextBoolean();

        //Evaluamos
        if (edad > 10 && !tieneMiedo) {
            //Mostramos los resultados
            System.out.println("Si puedes entrar :)");
        } else {
            //Mostramos los resultados
            System.out.println("No puedes entrar :(");
        }
    }
}
