import java.util.Scanner;

/**
 *  Programa para determinar si un persona es mayor de edad
 */
public class Condicionalanidada{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("PROGRAMA PARA DETERMINAR LA MAYORIA DE EDAD ");
        System.out.println("INGRESE SU EDAD: ");
        int edad = teclado.nextInt();
        if (edad > 0 && edad <= 150) {
            if (edad > 0 && edad < 18) {
                System.out.println("eres menor de edad");
                System.out.println("eres aun un niño");
            } else if (edad >= 18 && edad <= 65) {
                System.out.println("eres mayor de edad");
            } else if (edad >= 65 && edad <= 100) {
                System.out.println("eres de la tercera edad");
            } else if (edad > 100 && edad <= 150) {
                System.out.println("Eres una persona longeva");
            } else
                System.out.println("ya se murio");
        }else
            System.out.println("esta edad es invalida");
        }
    }


