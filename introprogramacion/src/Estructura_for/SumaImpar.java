package Estructura_for;

import java.util.Scanner;

public class SumaImpar {
    public static void main(String[] args) {
        System.out.println("INGRESE EL NUMERO LIMITE: ");
        Scanner teclado = new Scanner(System.in);
        int limite = teclado.nextInt();
        int suma_impares = 0;
        for (int contador = 1; contador <= limite; contador+=2) {
            if (contador % 2 == 1)
                suma_impares = suma_impares + contador;
        }
        System.out.println("LA SUMA DE NUMEROS IMPARES = " + suma_impares);
    }
}