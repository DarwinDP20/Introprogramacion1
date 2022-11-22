package Estructura_for;

import java.util.Scanner;

public class Factorial_For {
    public static void main(String[] args) {
        System.out.println("INGRESE UN NUMERO");
        Scanner teclado = new Scanner(System.in);
        int numero= teclado.nextInt();
        int factorial=1;
        for(int contador = 1; contador <= numero;contador++ ){
            factorial=factorial*contador;
        }
        System.out.println("\nFactorial de %d = %d\n",numero,factorial);

    }
}
