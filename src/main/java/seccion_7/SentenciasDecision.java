package seccion_7;

public class SentenciasDecision {
    public static void main(String[] args) {
        //Uso de la sentencia if else
        int edad = 30;

        //En esta parte del codigo se evalua la expresion
        if (edad >= 18) {
            //En el caso de que sea verdadero
            System.out.println("Eres mayor de edad");
        } else {
            //En el caso que sea falso
            System.out.println("Eres menor de edad");
        }

        //Uso de la sentencia if
        if (edad > 18) {
            //En el caso de que sea verdadero
            System.out.println("Eres mayor de edad");
        }

        //Uso de la sentencia con un booleano
        boolean condicion = edad <= 15;

        //Se evalua la condicion dependiendo de su contenido booleano
        if (condicion) {
            System.out.println("Es menos a 15 años");
        }

        //Uso de la condicion If-else - If-else
        //Esta condicion hace diferentes evaluaciones hasta que coincida en la respuesta adecuada
        if (edad >= 18) {
            System.out.println("Ya vas a pagar impuestos :(");
        } else if (edad >= 15 && edad < 18) {
            System.out.println("Estas apunto de pagar impuestos :0");
        } else {
            System.out.println("Aun no tienes que pagar impuestos :)");
        }

        //Operador ternario
        boolean expresion = edad >= 18; //Es una expresion booleana que se evalua
        boolean verdadero = true; //Es el valor que se retorna si la expresion es verdadera
        boolean falso = false; //Es el valor que se retorna si la expresion es falsa

        condicion = expresion ? verdadero : falso; //Operador ternario

        //Operador ternario anidado
        //Valor positivo, negativo o cero
        int numero = 12;
        String mensaje = numero > 0 ? "Es positivo" : numero < 0 ? "Es negativo" : "Es cero";
        System.out.println("El numero es: " + mensaje);

        //Estructura de control switch classic
        int option = 3;

        //A qui se evalua la condicion o la opcion multiple
        switch (option) {
            //Busca la opcion indicada, contenida en (opcion)
            case 1:
                //En el caso de que coincida con la primera opcion entra aqui
                System.out.println("Caso 1");
                break;  //Si no se declara la centencia break continua con el siguiente bloque
            case 2:
                //En el caso de que encuentre la segunda
                System.out.println("Caso 2");
                break;
            default:
                //En el caso de no encontrar ninguna
                System.out.println("Caso por defecto");
        }

        //Estructura switch mejorado
        int dia = 3;
        String nombreDia;

        //A qui se evalua la condicion o la opcion multiple y se asigna a la variable
        nombreDia = switch (dia){
            case 1 -> "lunes";  //En el caso de que coincida con la primera opcion entra aqui y asi continua
            case 2 -> "Martes";
            case 3 -> "Miercoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sabado";
            case 7 -> "Domingo";
            default -> "Dia invalido";  //En el caso de no encontrar ninguna
        };

        System.out.println("El nombre es: " + nombreDia);
    }
}
