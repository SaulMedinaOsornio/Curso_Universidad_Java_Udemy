package seccion_4;

public class ManejoCadenas {
    public static void main(String[] args) {
        //Diferentes formas en las que una cadena puede ser ocupada.
        var cadena1 = "Hola";
        var cadena2 = new String("Mundo");
        var cadena3 = cadena1 + " " + cadena2;
        var cadena4 =
                """
                Cadenas
                Multi linea
                """;


        //Comparacion de cadenas & pool de cadenas

        //Cuando se crean dos objetos identicos
        //en memoria se referencian del mismo
        var cadena_1 = "Java";
        var cadena_2 = "Java";

        //Se crea un nuevo objeto o una nueva referencia a pesar de ser el mismo dato
        var cadena_3 = new String ("Java");

        var cadena_4 = "Go";

        //Comparar referencia
        System.out.println("Cadena_1 es igual a la cadena_2 ");
        System.out.println(cadena_1 == cadena_2); //Retorna true debido a que es la misma
        System.out.println(cadena_1 == cadena_3); //Retorna false debido a que no es la misma

        //Compramos contenido
        System.out.println("Cadena_1 es igual a la cadena_2 en contenido");
        System.out.println(cadena_1.equals(cadena_2)); //Retorna true debido a que es el mismo

        System.out.println("Cadena_1 es igual a la cadena_4 en contenido");
        System.out.println(cadena_1.equals(cadena_4)); //Retorna false debido a que no es la misma

        //Concatenation de cadenas
        //Con el metodo concat
        System.out.println("Union de cadenas: " + cadena1.concat(" ").concat(cadena2));
        //Con el Objeto StringBuffer
        var stringBuffer = new StringBuffer();
        stringBuffer.append(cadena1).append(" ").append(cadena2);
        System.out.println("StringBuffer: " + stringBuffer.toString());

        //Con el Objeto StringBuilder
        //Este es mas utilizado en el multi hilo
        var stringBuilder = new StringBuilder();
        stringBuilder.append(cadena1).append(" ").append(cadena2);
        System.out.println("StringBuilder: " + stringBuilder.toString());

        //Con el metodo join
        //En la primera parte donde se encuentra el comillado con espacio (" ") se le llama delimitador
        //este agrega lo como cado ahi entre cada palabra agregada
        var cadena = String.join(" ", cadena1, cadena2);
        System.out.println("Cadena con Join: " + cadena);
    }
}
