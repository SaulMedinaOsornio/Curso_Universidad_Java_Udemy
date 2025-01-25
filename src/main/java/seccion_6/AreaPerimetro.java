package seccion_6;
/*
Cálculo Área y Perímetro de un Rectángulo

Este programa tiene como objetivo calcular el área y el perímetro de un rectángulo
utilizando las fórmulas matemáticas básicas:

            ------------------
            |                |
            |                |
            |                |  Altura
            |                |
            |                |
            ------------------
                  Base

1. Fórmula para el área:
   área = base * altura

2. Fórmula para el perímetro:
   perímetro = 2 * (base + altura)

El programa solicitará al usuario que ingrese los valores de la base y la altura,
y calculará los resultados correspondientes.
*/

import java.util.Scanner;

public class AreaPerimetro {
    public static void main(String[] args) {

        //Instanciamos el objeto scanner
        Scanner scanner = new Scanner(System.in);

        //Preguntamos por la informacion
        System.out.print("Ingresa la altura: ");
        double altura = scanner.nextDouble();

        System.out.print("Ingresa la base: ");
        double base = scanner.nextDouble();

        //Calculamos el area & el perimetro
        double area = base * altura;
        double perimetro = 2 * (base + altura);

        System.out.printf("""
                            ------------------
                            |                |
                            |                |
                            |   Area = %.2f    Altura = %.2f
                            |                | Perimetro = %.2f
                            |                |
                            ------------------
                                Base = %.2f
                        """, area, altura, perimetro, base);
    }
}
