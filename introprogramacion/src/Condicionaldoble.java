import java.util.Scanner;

/**
 *  Programa para determinar si un persona es mayor de edad
 */
public class Condicionaldoble {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("PROGRAMA PARA DETERMINAR LA MAYORIA DE EDAD ");
        System.out.println("INGRESE SU EDAD: ");
        int edad = teclado.nextInt();
        boolean evaluacion = (edad >= 18);
        if (evaluacion){
            System.out.println("eres mayor de edad");
            System.out.println("estas casi listo para ir a la universidad");
        }else {
            System.out.println("Aun eres menor de edad");
        }
    }
}
