package seccion_7;
/*
 * Sistema de Validación de Usuario y Contraseña
 *
 * Crear un sistema para validar los valores de usuario y contraseña proporcionados.
 *
 * Se deben definir dos constantes con los valores válidos de usuario y contraseña.
 *
 * El sistema debe comparar los valores válidos contra los valores proporcionados. Se deben considerar 3 casos:
 *
 * 1. Usuario y contraseña válidos. Debe imprimir: "Bienvenido al Sistema"
 * 2. Usuario inválido. Debe imprimir: "Usuario inválido"
 * 3. Contraseña inválida. Debe imprimir: "Contraseña inválida"
 */

import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        //Instancia
        Scanner scanner = new Scanner(System.in);

        //Constantes
        final String USUARIO_DEFAULT = "root";
        final String PASSWORD_DEFAULT = "admin";

        //Solicitamos la informacion
        System.out.print("Usuario: ");
        String usuario = scanner.nextLine();

        System.out.print("Password: ");
        String password = scanner.nextLine();

        //Evaluamos
        if (!USUARIO_DEFAULT.equals(usuario)) {
            System.out.println("Usuario no valido");
        }
        if (!PASSWORD_DEFAULT.equals(password)) {
            System.out.println("Password no valido");
        }
        if (USUARIO_DEFAULT.equals(usuario) && PASSWORD_DEFAULT.equals(password)) {
            System.out.println("Usuario autenticado");
        }
    }
}
