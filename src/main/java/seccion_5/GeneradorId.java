package seccion_5;
/*
 Generador de ID Único
 Programa que genera un identificador único para cada persona.
 Se solicita al usuario los siguientes datos:
    - Nombre (String)
    - Apellido (String)
    - Año de Nacimiento (int en formato YYYY)
 Reglas del programa:
 1. Generar un número aleatorio de 4 dígitos (1 a 9999).
 2. Si el número es menor a 4 dígitos, completarlo con ceros a la izquierda.
 3. Crear el ID único combinando:
    - Las dos primeras letras del Nombre.
    - Las dos primeras letras del Apellido.
    - Los últimos dos dígitos del Año de Nacimiento.
    - El número aleatorio de 4 dígitos.
 Ejemplo:
    - Nombre: Juan → JU
    - Apellido: Pérez → PE
    - Año de Nacimiento: 1995 → 95
    - Aleatorio: 0736
    - ID Único: JUPE950736
*/

import java.util.Random;
import java.util.Scanner;

public class GeneradorId {
    public static void main(String[] args) {

        //Instancia mos la clase Scanner y Random
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //Solicitamos los datos y los asignamos
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Año de nacimiento (yyyy): ");
        String fechaNacimiento = scanner.nextLine();

        //Generamos el ID unico
        //String ID
        String nombreId = (nombre.substring(0, 2) + apellido.substring(0, 2) + fechaNacimiento.substring(2)).toUpperCase();

        //Generador de numeric ID
        String numeroId = String.format("%04d", (random.nextInt(9999) + 1));

        //Union ID Unico
        String idUnico = nombreId.concat(numeroId);

        //Imprimimos el ID unico
        System.out.printf("""
                \nHola %s %s hemos generado tu nuevo ID
                ----------------------------------------
                \tID Unico: %s
                """, nombre, apellido, idUnico);
    }
}
