package Estructura_for;

import java.util.Scanner;

public class DivisorNumero {
    public static void main(String[] args) {
        System.out.println("INGRESE UN NUMERO");
        Scanner teclado = new Scanner(System.in);
                int numero = teclado.nextInt();
        for (int contador=1; contador; contador++){
            if (numero%contador==0);
            System.out.println("LOS DIVISORES SON "+contador);
        }
    }
}
