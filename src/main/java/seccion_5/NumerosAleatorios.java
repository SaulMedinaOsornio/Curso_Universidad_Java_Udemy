package seccion_5;

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        //Numeros aleatorios utilizando random

        //Instancia
        Random aleatorio = new Random();

        //Numero entero aleatorio con rango de 0 a 9
        System.out.println("Random aleatorio 0-9: " + aleatorio.nextInt(10));

        //Numero entero aleatorio con rango de 1 a 10
        System.out.println("Random aleatorio 1-10: " + (aleatorio.nextInt(10) + 1));

        //Regresar un numero aleatorio decimal, no se le pasan parameters
        System.out.println("Random aleatorio Float 0.0-1.0: " + aleatorio.nextFloat());
        System.out.println("Random aleatorio Double 0.0-1.0: " + aleatorio.nextDouble());
    }
}
