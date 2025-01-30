package seccion_7;

public class DiaSemana {
    public static void main(String[] args) {

        int diaSemana = 5; //Declaramos un dia de la semana
        String diaSemanaStr = "";

        //Evaluamos el caso para remplazar por el dia correcto
        switch (diaSemana) {
            case 1:
                diaSemanaStr = "Lunes";
                break;
            case 2:
                diaSemanaStr = "Martes";
                break;
            case 3:
                diaSemanaStr = "Miercoles";
                break;
            case 4:
                diaSemanaStr = "Jueves";
                break;
            case 5:
                diaSemanaStr = "Viernes";
                break;
            case 6:
                diaSemanaStr = "Sabado";
                break;
            case 7:
                diaSemanaStr = "Domingo";
                break;
            default:
                diaSemanaStr = "Dia no valido!!!";
        }

        System.out.println("El dia de la semana " + diaSemana + " es " + diaSemanaStr);
    }
}
