import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero dependiendo del dia de la semana");
        Scanner teclado = new Scanner(System.in);
        int dia = teclado.nextInt();
        if (dia == 1)
            System.out.println("Es lunes");
        else if (dia == 2)
            System.out.println("Es martes");
        else if (dia == 3)
            System.out.println("Es miercoles");
        else if (dia == 4)
            System.out.println("Es jueves");
        else if (dia == 5)
            System.out.println("Es viernes");
        else if (dia == 6)
            System.out.println("Es sabado");
        else if (dia == 7)
            System.out.println("Es domingo");
        else
            System.out.println("Ese dia no existe");
    }
}
