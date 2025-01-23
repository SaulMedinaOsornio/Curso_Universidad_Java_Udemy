package seccion_5;

public class FormateoCadenas {
    public static void main(String[] args) {
        var nombre = "Carlos Alexis";
        var numeroEmpleado = 144;
        var edad = 18;
        var salario = 3000.394;

        //Formateo con String.format
        var mensaje = String.format("Nombre: %s Edad: %d Salario: $%.2f", nombre, edad, salario);
        System.out.println(mensaje);

        //Formateo de cadenas con printf
        System.out.printf("Nombre: %s Edad: %d Salario: $%.2f", nombre, edad, salario);

        //Formateo de bloques de texto
        mensaje = """
                \nDetalle Persona:
                -----------------------
                \tNombre: %s
                \tNo. Empleado: %04d
                \tEdad: %d años
                \tSalario: %.2f
                """.formatted(nombre, numeroEmpleado, edad, salario);
        System.out.print(mensaje);

        System.out.printf("""
                \nDetalle Persona:
                -----------------------
                \tNombre: %s
                \tNo. Empleado: %04d
                \tEdad: %d años
                \tSalario: %.2f
                """, nombre, numeroEmpleado, edad, salario);
    }
}
