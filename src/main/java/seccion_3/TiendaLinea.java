package seccion_3;
// Tienda en Línea (Detalle Producto)
// En el siguiente reto deben crear varias variables para almacenar
// el detalle de un producto de una tienda en línea.
//
// El detalle a almacenar del producto es el siguiente:
// - Nombre del Producto
// - Precio
// - Cantidad Disponible
// - Indicar si está disponible para venta
//
// Deben asignar valores de prueba a cada variable,
// escoger el nombre de cada variable aplicando las buenas prácticas,
// y mandar a imprimir el valor de cada variable.
//
// Finalmente deben modificar el valor de cada variable con nuevos datos,
// y mandar a imprimir nuevamente el valor de cada variable
// y así comprobar que se modificaron correctamente los valores.

public class TiendaLinea {
    public static void main(String[] args) {
        //Producto
        String nombreProducto = "Alexa";
        double precioProducto = 15.26;
        int cantidadDisponible = 10;
        boolean estaDisponible = true;

        //Imprimimos el valor
        System.out.println("Nombre del producto: " + nombreProducto);
        System.out.println("Precio del producto: " + precioProducto);
        System.out.println("Cantidad disponible: " + cantidadDisponible);
        System.out.println("Esta Disponible: " + estaDisponible);

        //Remplazando el valor de las variables
        nombreProducto = "Google";
        precioProducto = 12.45;
        cantidadDisponible = 4;
        estaDisponible = false;

        //Imprimimos el valor ya cambiado
        System.out.println("\nNombre del producto: " + nombreProducto);
        System.out.println("Precio del producto: " + precioProducto);
        System.out.println("Cantidad disponible: " + cantidadDisponible);
        System.out.println("Esta Disponible: " + estaDisponible);
    }
}
