package seccion_6;

import java.util.Scanner;

public class DentroRango {
    public static void main(String[] args) {
        //Buscar si un numero esta dentro del rango

        //Instanciamos los objetos
        Scanner scanner = new Scanner(System.in);
        final int MINIMO = 1;
        final int MAXIMO = 10;

        //Preguntamos por un valor
        System.out.printf("Ingresa un valor dentro del rango %d -- %d: ", MINIMO, MAXIMO);
        int valor = scanner.nextInt();

        //Evaluamos si esta dentro del rango
        boolean resultado = valor >= MINIMO && valor <= MAXIMO;

        //Mostramos el resultado
        System.out.printf("El valor: %d esta dentro del rango? " + resultado, valor);
    }
}
