package seccion_3;
// Detalle de una Persona
// Se solicita crear una clase llamada DetallePersona.java que realice lo siguiente:
//
// Debe declarar las siguientes variables y deberás asignar los valores que correspondan,
// además de seleccionar el tipo de dato adecuado para cada variable:
//
// - Nombre Completo
// - Edad
// - Altura (en metros)
// - País de Origen
// - Indicar si es casado o soltero con sólo carácter, ejemplo:
//   'C' - Casado, 'S' - Soltero

public class DetallePersona {
    public static void main(String[] args){

        //Creamos todas las referencias
        String nombre = "Saul M";
        int edad = 22;
        double altura = 1.70;
        String paisOrigen = "Mexico";
        char estaCasado = 's'; //C- Para casado & S- Para soltero

        //Imprimimos la información
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Pais de origen: " + paisOrigen);
        System.out.println("Esta Casado: " + estaCasado);
    }
}
