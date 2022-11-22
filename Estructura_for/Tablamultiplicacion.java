package Estructura_for;

import java.util.Scanner;

public class Tablamultiplicacion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("INGRESE UN NUMERO: ");
        int numero = teclado.nextInt();
        boolean interruptor = true;
        for (int contador = 10;  contador >=0 && interruptor == true; contador--) {
            int mult = numero * contador;
            System.out.println(numero +" * " + contador +" * " + mult );
            if (contador == 5)
                interruptor = false;
        }
    }
}