package Estructura_for;

import java.util.Scanner;

public class TablaAsteriscos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("INGRESE EL NUMERO DE FILAS: ");
        int filas = teclado.nextInt();
        System.out.println("INGRESE EL NUMERO DE COLUMNAS");
        int columnas = teclado.nextInt();
        String fila_asteriscos = "";
        for (int columna = 1; columna <= columnas; columna++){ //controlamos el numero de comlumnas
            fila_asteriscos = fila_asteriscos + "*";
        }
        for (int fila = 1; fila <= filas; fila++){ //controlamos el numero de filas
            System.out.println(fila_asteriscos);

        }
    }
}
