package seccion_4;
// Generador de Email
// Programa para generar un email a partir de los siguientes datos:

// Nombre: Ubaldo Acosta Soto
// Empresa: Global Mentoring
// Dominio: com.mx

// Resultado final:
// email: ubaldo.acosta.soto@globalmentoring.com.mx
public class GeneradorEmail {
    public static void main(String[] args) {
        //Definimos los valores
        String nombre = "Ubaldo Acosta Soto";
        String empresa = "Global Mentoring";
        String dominio = "com.mx    ";

        //Damos formato a todos los valores
        String nombreFormato = nombre.replace(" ", ".").toLowerCase();
        String empresaFormato = empresa.replace(" ", "").toLowerCase();
        String dominioFormato = "@" + empresaFormato + "." + dominio.trim();

        //Unimos todo para generar un email
        String email = nombreFormato.concat(dominioFormato);
        System.out.println("El email es: " + email);
    }
}
