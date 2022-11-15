package Repeticion_while;

import javax.print.attribute.standard.JobKOctets;
import javax.swing.JOptionPane;

/**
 * GENERAR LA TABLADE MULTIPLICAR HASTA EL 10 DE UN NUMERO INGRESADO POR TECLADO
 */
public class Tablamultiplicacion {
    public static void main(String[] args) {
       //System.out.println("Progrmam para generar la tabla de multiplicar");
        JOptionPane.showMessageDialog(null,"Progrma para generar la tabla multiplicar hasta el 10 de un numero por teclado");
        //System.out.println("ingrese un numero: ");
        String num =JOptionPane.showInputDialog("ingrese numero: ");
        int contador = 1;
        String acumulador = "";
        while (contador <= 10){
            int munlt = Integer.parseInt(num) * contador;//convertimos valor string a int
            String salida = num + " * " + String.valueOf(contador) + "=" + String.valueOf(munlt) + "\n";
            acumulador = acumulador + salida;
            contador = contador + 1;

        }
        JOptionPane.showMessageDialog( null, acumulador);
    }
}
