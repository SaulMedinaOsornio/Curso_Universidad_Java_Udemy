package seccion_5;
// Sistema de Empleados
// Programa para pedir la información de un empleado.

// Los datos solicitados son:
// - Nombre del Empleado (String)
// - Edad (int)
// - Salario (double)
// - Es Jefe de Departamento (boolean)

import java.util.Scanner;

// Una vez que se han capturado los datos, se deben mandar a imprimir a consola.
public class SistemaEmpleados {
    public static void main(String[] args) {

        //Instancia mos el objeto Scanner
        Scanner scanner = new Scanner(System.in);

        //Imprimimos los mensajes y la captura de los datos
        System.out.print("Ingrese el nombre: ");
        String nombreEmpleado = scanner.nextLine();

        System.out.print("Ingrese la edad: ");
        int edadEmpleado = scanner.nextInt();

        System.out.print("Ingrese el salario: ");
        double salarioEmpleado = scanner.nextDouble();

        System.out.print("Ingrese si es jefe del departamento (true/false)?: ");
        boolean esJefeDepartamento = scanner.nextBoolean();

        //Imprimimos la informacion en su respectivo formato
        System.out.println("\nSistema de registro de empleados:");
        System.out.println("\tNombre: " + nombreEmpleado);
        System.out.println("\tEdad: " + edadEmpleado);
        System.out.println("\tSalario: $" + salarioEmpleado);
        System.out.println("\tEs jefe del departamento?: " + esJefeDepartamento);
    }
}
