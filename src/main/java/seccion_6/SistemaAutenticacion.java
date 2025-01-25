package seccion_6;
/*
Sistema de Autenticación

Este programa tiene como objetivo validar el usuario y el password proporcionados por el usuario.

1. Define 2 constantes con los valores correctos de usuario y password.
2. Solicita al usuario ingresar su nombre de usuario y contraseña.
3. Compara los valores ingresados con las constantes previamente definidas.
4. Si los valores coinciden, imprime "true"; de lo contrario, imprime "false".

Este mecanismo básico de autenticación no es seguro para aplicaciones reales, ya que las contraseñas no deberían almacenarse como texto plano.
*/

import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {

        //Instanciamos y declaramos
        Scanner scanner = new Scanner(System.in);

        //Definimos las constantes que actuan como base de datos
        final String USER = "root";
        final String PASS = "admin";

        //Solicitar la informacion al usuario
        System.out.println("-------- Sistema Autenticacion --------");
        System.out.print("Ingrese su usuario: ");
        String usuario = scanner.nextLine();

        System.out.print("Ingrese su password: ");
        String password = scanner.nextLine();

        //Validamos la informacion
        boolean isValid = USER.equals(usuario) && PASS.equals(password);

        //Mandamos mensaje de validacion
        System.out.printf("Acceso a usuario [%s] = %b", usuario, isValid);
    }
}
