package seccion_3;
// Sistema de Reserva de Hoteles
// Se les deja realizar el siguiente reto: Capturar el detalle de la reservación de hoteles.
//
// El detalle que se debe capturar es:
// - Nombre de Cliente
// - Días de Estancia
// - Tarifa Diaria
// - Indicar si la habitación cuenta con vista al mar
//
// Deben asignar valores iniciales y mandar a imprimir el valor de cada variable.
//
// Por último, se les pide modificar algunos valores de la reservación
// y mandar a imprimir nuevamente cada variable para observar los cambios.

public class Reserva {
    public static void main(String[] args) {

        //Se asignan los valores principales
        System.out.println("*** Detalle de reserva de hoteles ***");
        String nombreCliente = "Hector";
        int diasEstancia = 3;
        double tarifaDiaria = 250.00;
        boolean estaDisponible = true;

        //Se imprimen los valores
        System.out.println("Nombre del que reserva: " + nombreCliente);
        System.out.println("Dias Estancia: " + diasEstancia);
        System.out.println("Tarifa Diaria: " + tarifaDiaria);
        System.out.println("Esta Disponible: " + estaDisponible);

        //Modificamos algun valor
        nombreCliente = "Alfonso";
        diasEstancia = 5;
        estaDisponible = false;

        //Se imprimen los valores
        System.out.println("\nNombre del que reserva: " + nombreCliente);
        System.out.println("Dias Estancia: " + diasEstancia);
        System.out.println("Tarifa Diaria: " + tarifaDiaria);
        System.out.println("Esta Disponible: " + estaDisponible);
    }
}
