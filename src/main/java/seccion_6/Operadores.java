package seccion_6;

public class Operadores {
    public static void main(String[] args) {
        /*
         * Los operadores son símbolos especiales que utilizamos para realizar operaciones sobre valores y variables.
         * Los operadores más comunes se pueden agrupar en las siguientes categorías:
         *
         * - Operadores Aritméticos (+, -, *, /, %):
         *   Nos permiten realizar operaciones matemáticas básicas.
         */
        int suma = 1 + 6;
        int resta = 1 - 2;
        int multiplicacion = 2 * 3;
        int division = 4 / 2;
        int restoDivicion = 5 / 2;

        /* - Operadores de Asignación (=, +=, -=, *=, /=, %=):
         *   Nos permiten asignar valores a variables.
         */
        int resultado = 0;
        resultado = 10; //Asignacion simple
        resultado += 10;//Asignacion incremento compuesto
        resultado -= 2; //Asignacion decremento compuesto
        resultado *= 2; //Asignacion multiplicacion compuesta
        resultado /= 2; //Asignacion division compuesta
        resultado %= 2; //Asignacion residuo compuesto

        /* - Operadores de Comparación (==, !=, >, <, >=, <=):
         *   Nos permiten comparar valores y regresan un valor booleano (true/false).
         */
        int a = 10, b = 20;
        boolean resultadoBooleano = a == b; //Operador de comparacion, busca que tengan el mismo valor
        resultadoBooleano = a != b; //Operador de negacion, busca que sean diferentes
        resultadoBooleano = a > b; //Operador de mayor, busca que el primer valor sea mayor al segundo
        resultadoBooleano = a >= b; //Operador de mayor o igual, busca que el primer valor sea mayor o igual al segundo
        resultadoBooleano = a <= b; //Operador de menor o igual, busca que el primer valor sea menor o igual al segundo


        /* - Operadores Lógicos (&&, ||, !):
         *   Nos permiten combinar expresiones booleanas y regresan un valor booleano.
         */
        resultadoBooleano = (a > b) && (a <= b); //Operador and busca que ambos resultados den verdadero
        resultadoBooleano = (a >= b) || (a <= b); //Operador or busca que alguno o ambos de los resultados den verdadero
        resultadoBooleano = !((a > b) || (a <= b)); //Operador de negacion busca contradecir el resultado si true = false

        /* - Operadores Unarios (+, -, ++, --, !):
         *   Nos permiten realizar operaciones sobre un solo operando. Incluyen incremento/decremento.
         */
        resultado = +a; //Hace al numero positivo, si ya lo es no hay cambios
        resultado = -b; //Hace al numero negativo, si ya lo es no hay cambios

        resultado = ++b; //Operador de pre incremento aumenta uno y luego lo asigna
        resultado = b++; //Operador de pos incremento aumenta uno despues de usarlo

        resultado = --b;//Operador de pre decremento aumenta uno y luego lo asigna
        resultado = b--; //Operador de pos decremento aumenta uno despues de usarlo


        /* - Operador Condicional Ternario ( ? : ):
         *   Simplifica la sentencia if-else.
         */

        //Operador ternario compara y dependiendo de la condicion regresa el primer valor si es true o el segundo si es false
        resultadoBooleano = a > b ? true : false;

        /*
Precedencia de Operadores en Java:

1. Paréntesis y Corchetes:
   Los paréntesis y corchetes tienen la mayor precedencia y se evalúan primero.

2. Operadores Unarios:
   Incluyen -, ++, --, que se aplican antes de cualquier operación aritmética.

3. Operadores Aritméticos (alta precedencia):
   Multiplicación (*), División (/), y Módulo (%).

4. Operadores Aritméticos (baja precedencia):
   Suma (+) y Resta (-).

5. Operadores Relacionales:
   Incluyen <, <=, >, >=, utilizados para comparar valores.

6. Operadores de Equivalencia:
   Verifican igualdad (==) y desigualdad (!=).

7. Operadores Lógicos:
   Incluyen AND lógico (&&) y OR lógico (||).

8. Operadores de Asignación:
   Incluyen =, +=, -=, *=, /=, entre otros.

Es importante conocer esta jerarquía para evitar errores en evaluaciones complejas.
*/

    }
}
