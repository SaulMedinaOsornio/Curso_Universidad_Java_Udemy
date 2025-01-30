package seccion_7;
/*
 * Aplicación de Salud y Fitness
 *
 * Se solicita crear una aplicación de salud y Fitness que solicite lo siguiente:
 * - Nombre del usuario
 * - Pasos caminados en el día
 *
 * Además, definiremos las siguientes constantes:
 * - META_PASOS_DIARIO = 10,000
 * - CALORIAS_POR_PASO = 0.04 // Valor aproximado en Kilocalorías
 *
 * Con los valores anteriores, debemos calcular las calorías quemadas según los pasos caminados:
 * calorías_quemadas = pasos_diarios * CALORIAS_POR_PASO
 *
 * Y verificaremos si se cumplió la meta de pasos diarios:
 * meta_alcanzada = pasos_diarios >= META_PASOS_DIARIO
 */

import java.util.Scanner;

public class AplicacionSaludFitness {
    public static void main(String[] args) {

        //Instancias
        Scanner scanner = new Scanner(System.in);

        //Constantes
        final int META_PASOS_DIARIO = 10000;
        final double CALORIAS_POR_PASO = 0.04;

        //Solicitamos la informacion
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Pasos caminados: ");
        int cantidadPasos = scanner.nextInt();

        //Evaluamos
        double caloriasQuemadas = cantidadPasos * CALORIAS_POR_PASO;
        String mensajeMetaPasos = cantidadPasos >= META_PASOS_DIARIO ? "cumplida" : "no cumplida";

        //Mostramos los resultados
        System.out.printf("""
                Hola %s
                Pasos caminados: %d
                Calorias quemadas: %.2f kcal
                Meta de %d %s
                """, nombre, cantidadPasos, caloriasQuemadas, META_PASOS_DIARIO, mensajeMetaPasos);
    }
}
